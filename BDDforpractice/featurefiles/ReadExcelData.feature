Feature: Excel data
Scenario Outline: Reading data from excel
Given The sheet name is "<SheetName>",row index is <row>,cell index is <cell>
Examples:
|SheetName|row|cell|
|Sheet1|0|0|
|Sheet2|3|0|
|Sheet3|4|2|