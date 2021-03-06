/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grammar DMLStatement;

import Symbol, Keyword, MySQLKeyword, Literals,BaseRule;


select 
    : withClause_? unionClause_
    ;

withClause_
    : WITH RECURSIVE? cteClause_ (COMMA_ cteClause_)*
    ;

cteClause_
    : ignoredIdentifier_ columnNames? AS subquery
    ;

unionClause_
    : selectClause (UNION (ALL | DISTINCT)? selectClause)*
    ;

selectClause
    : SELECT selectSpecification_* selectItems fromClause? whereClause? groupByClause? havingClause? windowClause_? orderByClause? limitClause? selectIntoExpression_? lockClause?
    ;

selectSpecification_
    : duplicateSpecification | HIGH_PRIORITY | STRAIGHT_JOIN | SQL_SMALL_RESULT | SQL_BIG_RESULT | SQL_BUFFER_RESULT | (SQL_CACHE | SQL_NO_CACHE) | SQL_CALC_FOUND_ROWS
    ;

duplicateSpecification
    : ALL | DISTINCT | DISTINCTROW
    ;

selectItems
    : (unqualifiedShorthand | selectItem) (COMMA_ selectItem)*
    ;

selectItem
    : (columnName | expr) (AS? alias)? | qualifiedShorthand
    ;

alias
    : identifier_ | STRING_
    ;

unqualifiedShorthand
    : ASTERISK_
    ;

qualifiedShorthand
    : identifier_ DOT_ASTERISK_
    ;

fromClause
    : FROM tableReferences
    ;

tableReferences
    : escapedTableReference_ (COMMA_ escapedTableReference_)*
    ;

escapedTableReference_
    : tableReference  | LBE_ OJ tableReference RBE_
    ;

tableReference
    : (tableFactor joinedTable)+ | tableFactor joinedTable*
    ;

tableFactor
    : tableName partitionNames_? (AS? alias)? indexHintList_? | subquery columnNames? | LP_ tableReferences RP_
    ;

partitionNames_ 
    : PARTITION LP_ identifier_ (COMMA_ identifier_)* RP_
    ;

indexHintList_
    : indexHint_ (COMMA_ indexHint_)*
    ;

indexHint_
    : (USE | IGNORE | FORCE) (INDEX | KEY) (FOR (JOIN | ORDER BY | GROUP BY))? LP_ indexName (COMMA_ indexName)* RP_
    ;

joinedTable
    : ((INNER | CROSS)? JOIN | STRAIGHT_JOIN) tableFactor joinSpecification?
    | (LEFT | RIGHT) OUTER? JOIN tableFactor joinSpecification
    | NATURAL (INNER | (LEFT | RIGHT) (OUTER))? JOIN tableFactor
    ;

joinSpecification
    : ON expr | USING columnNames
    ;

whereClause
    : WHERE expr
    ;

groupByClause
    : GROUP BY orderByItem (COMMA_ orderByItem)* (WITH ROLLUP)?
    ;

havingClause
    : HAVING expr
    ;

limitClause
    : LIMIT ((limitOffset COMMA_)? limitRowCount | limitRowCount OFFSET limitOffset)
    ;

limitRowCount
    : numberLiterals | parameterMarker
    ;
    
limitOffset
    : numberLiterals | parameterMarker
    ;

windowClause_
    : WINDOW windowItem_ (COMMA_ windowItem_)*
    ;

windowItem_
    : ignoredIdentifier_ AS LP_ windowSpecification_ RP_
    ;

subquery
    : LP_ unionClause_ RP_ AS? alias?
    ;

selectLinesInto_
    : STARTING BY STRING_ | TERMINATED BY STRING_
    ;

selectFieldsInto_
    : TERMINATED BY STRING_ | OPTIONALLY? ENCLOSED BY STRING_ | ESCAPED BY STRING_
    ;

selectIntoExpression_
    : INTO identifier_ (COMMA_ identifier_ )* | INTO DUMPFILE STRING_
    | (INTO OUTFILE STRING_ (CHARACTER SET IDENTIFIER_)?((FIELDS | COLUMNS) selectFieldsInto_+)? (LINES selectLinesInto_+)?)
    ;

lockClause
    : FOR UPDATE | LOCK IN SHARE MODE
    ;
