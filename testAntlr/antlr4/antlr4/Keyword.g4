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

lexer grammar Keyword;

import Alphabet;

WS
    : [ \t\r\n] + ->skip
    ;

SELECT
    : S E L E C T
    ;

INSERT
    : I N S E R T
    ;

UPDATE
    : U P D A T E
    ;

DELETE
    : D E L E T E
    ;

CREATE
    : C R E A T E
    ;


TRUNCATE
    : T R U N C A T E
    ;

SCHEMA
    : S C H E M A
    ;


SET
    : S E T
    ;

TABLE
    : T A B L E
    ;

INDEX
    : I N D E X
    ;

CONSTRAINT
    : C O N S T R A I N T
    ;

PRIMARY
    : P R I M A R Y
    ;

UNIQUE
    : U N I Q U E
    ;

FOREIGN
    : F O R E I G N
    ;

KEY
    : K E Y
    ;

POSITION
    : P O S I T I O N
    ;

PRECISION
    : P R E C I S I O N
    ;

FUNCTION
    : F U N C T I O N
    ;

TRIGGER
    : T R I G G E R
    ;

PROCEDURE
    : P R O C E D U R E
    ;

VIEW
    : V I E W
    ;

INTO
    : I N T O
    ;

VALUES
    : V A L U E S
    ;

WITH
    : W I T H
    ;

UNION
    : U N I O N
    ;

DISTINCT
    : D I S T I N C T
    ;

CASE
    : C A S E
    ;

WHEN
    : W H E N
    ;

CAST
    : C A S T
    ;

TRIM
    : T R I M
    ;

SUBSTRING
    : S U B S T R I N G
    ;

FROM
    : F R O M
    ;

NATURAL
    : N A T U R A L
    ;

JOIN
    : J O I N
    ;

FULL
    : F U L L
    ;

INNER
    : I N N E R
    ;

OUTER
    : O U T E R
    ;

LEFT
    : L E F T
    ;

RIGHT
    : R I G H T
    ;

CROSS
    : C R O S S
    ;

USING
    : U S I N G
    ;

WHERE
    : W H E R E
    ;

AS
    : A S
    ;

ON
    : O N
    ;

IF
    : I F
    ;

ELSE
    : E L S E
    ;

THEN
    : T H E N
    ;

FOR
    : F O R
    ;

TO
    : T O
    ;

AND
    : A N D
    ;

OR
    : O R
    ;

IS
    : I S
    ;

NOT
    : N O T
    ;

NULL
    : N U L L
    ;

TRUE
    : T R U E
    ;

FALSE
    : F A L S E
    ;

EXISTS
    : E X I S T S
    ;

BETWEEN
    : B E T W E E N
    ;

IN
    : I N
    ;

ALL
    : A L L
    ;

ANY
    : A N Y
    ;

LIKE
    : L I K E
    ;

ORDER
    : O R D E R
    ;

GROUP
    : G R O U P
    ;

BY
    : B Y
    ;

ASC
    : A S C
    ;

DESC
    : D E S C
    ;

HAVING
    : H A V I N G
    ;

LIMIT
    : L I M I T
    ;

OFFSET
    : O F F S E T
    ;

BEGIN
    : B E G I N
    ;

COMMIT
    : C O M M I T
    ;

ROLLBACK
    : R O L L B A C K
    ;

SAVEPOINT
    : S A V E P O I N T
    ;

BOOLEAN
    : B O O L E A N
    ;

DOUBLE
    : D O U B L E
    ;

FLOAT
    : F L O A T
    ;

LONG
    : L O N G
    ;

INT
    : I N T
    ;

CHAR
    : C H A R
    ;

VARCHAR
    : V A R C H A R
    ;

BIGINT
    : B I G I N T
    ;

BIT
    : B I T
    ;

BLOB
    : B L O B
    ;

BOOL
    : B O O L
    ;

DATETIME
    : D A T E T I M E
    ;

LONGBLOB
    : L O N G B L O B
    ;

LONGTEXT
    : L O N G T E X T
    ;

MEDIUMBLOB
    : M E D I U M B L O B
    ;

MEDIUMINT
    : M E D I U M I N T
    ;

MEDIUMTEXT
    : M E D I U M T E X T
    ;

SMALLINT
    : S M A L L I N T
    ;

TEXT
    : T E X T
    ;

CHARACTER
    : C H A R A C T E R
    ;

ARRAY
    : A R R A Y
    ;

INTERVAL
    : I N T E R V A L
    ;

DATE
    : D A T E
    ;

TIME
    : T I M E
    ;

TIMESTAMP
    : T I M E S T A M P
    ;

TINYBLOB
    : T I N Y B L O B
    ;

TINYINT
    : T I N Y I N T
    ;

TINYTEXT
    : T I N Y T E X T
    ;

JSON
    : J S O N
    ;

LOCALTIME
    : L O C A L T I M E
    ;

LOCALTIMESTAMP
    : L O C A L T I M E S T A M P
    ;

YEAR
    : Y E A R
    ;

QUARTER
    : Q U A R T E R
    ;

MONTH
    : M O N T H
    ;

WEEK
    : W E E K
    ;

DAY
    : D A Y
    ;

HOUR
    : H O U R
    ;

MINUTE
    : M I N U T E
    ;

SECOND
    : S E C O N D
    ;

MICROSECOND
    : M I C R O S E C O N D
    ;

MAX
    : M A X
    ;

MIN
    : M I N
    ;
    
SUM
    : S U M
    ;

COUNT
    : C O U N T
    ;

AVG
    : A V G
    ;

DEFAULT
    : D E F A U L T
    ;

CURRENT
    : C U R R E N T
    ;

ENABLE
    : E N A B L E
    ;

DISABLE
    : D I S A B L E
    ;


INSTANCE
    : I N S T A N C E
    ;


DO
    : D O
    ;

DEFINER
    : D E F I N E R
    ;



CASCADED
    : C A S C A D E D
    ;

LOCAL
    : L O C A L
    ;

CLOSE
    : C L O S E
    ;

OPEN
    : O P E N
    ;

NEXT
    : N E X T
    ;

NAME
    : N A M E
    ;


INTEGER
    : I N T E G E R
    ;

DECIMAL
    : D E C I M A L
    ;

