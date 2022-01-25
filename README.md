# Arrays Algorithms, City Housing Data

In this project you will build and calculate some information on arrays. The arrays will store information on the housing sales in several fictional cities.

## Starting Code

The HouseData.java file provides you with method headers and a main method to test each method. Each method has the Javadoc provided to provide instructions and goals.

## Instructions

Begin by building two instance fields, cityNames and prices, with the following information:

```
| cityNames  | prices                                     |
| -----------| -------------------------------------------|
| Fairview   |  545.5 |  785.2 |  824.4 |  599.9 |
| Springfield|  499.5 |  324.5 | 1458.9 |
| Arlington  |  800.0 |  759.9 |  725.0 |  750.7 |  825.9 |
| Madison    |  435.0 |  459.4 |
```
cityNames should only store the names of the cities.
prices should be a 2-dimensional array, with each row being the data for one city.

Follow the instructions provided in the Javadoc for each method. As you complete each method, uncomment the corresponding section in the main method to test your code. Check the expected output at the bottom of those README with your results.

Most methods can be done in any order. However, getCityIndex can make another method easier to write.

## A Completed Project Will:

Match the following output:
```
The city with the most sales was: Arlington

Springfield's index is 1
Madison's index is 3
Riverside's index is -1

Arlington's average housing price was: 772.3k
Ashland's average housing price was: 0.0k

Average housing price was: 699.6k

The most expensive house was: 1458.9k

All Houses Sold
Fairview [545.5, 785.2, 824.4, 599.9]
Springfield [499.5, 324.5, 1458.9]
Arlington [800.0, 759.9, 725.0, 750.7, 825.9]
Madison [435.0, 459.4]

Month Balance
1       337.3
2       334.1
3       330.9
4       327.7
5       324.5
6       321.3
7       318.1
8       314.9
9       311.7
10      308.5
11      305.3
12      302.1
13      298.9
14      295.7
15      292.5
16      289.3
17      286.1
18      282.9
19      279.7
20      276.5
21      273.3
22      270.1
23      266.9
24      263.7
25      260.5
26      257.3
27      254.1
28      250.9
29      247.7
30      244.5
31      241.3
32      238.1
33      234.9
34      231.7
35      228.5
36      225.3
37      222.1
38      218.9
39      215.7
40      212.5
41      209.3
42      206.1
43      202.9
44      199.7
45      196.5
46      193.3
47      190.1
48      186.9
49      183.7
50      180.5
51      177.3
52      174.1
53      170.9
54      167.7
55      164.5
56      161.3
57      158.1
58      154.9
59      151.7
60      148.5
61      145.3
62      142.1
63      138.9
64      135.7
65      132.5
66      129.3
67      126.1
68      122.9
69      119.7
70      116.5
71      113.3
72      110.1
73      106.9
74      103.7
75      100.5
76       97.3
77       94.1
78       90.9
79       87.7
80       84.5
81       81.3
82       78.1
83       74.9
84       71.7
85       68.5
86       65.3
87       62.1
88       58.9
89       55.7
90       52.5
91       49.3
92       46.1
93       42.9
94       39.7
95       36.5
96       33.3
97       30.1
98       26.9
99       23.7
100      20.5
101      17.3
102      14.1
103      10.9
104       7.7
105       4.5
106       1.3
107       0.0
```

## Extension

* Write a method called averageFirstSold, which returns the average price of the first house sold in each city (the first sold is the price in index 0 for each row).
* Write a method called averageLeastExpensive, which returns the average price of the least expensive house sold in each city.
* Write a method called 'afordableCities', which takes in a maximumPriceValue and returns a boolean array, where each index of the array represents one city. The value in an index will be true IF there is at least one house in that city that has a price less than or equal to the maximumPriceValue.