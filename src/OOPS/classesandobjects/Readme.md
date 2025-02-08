Billing

Create a cash register for a fruit store that enables to complete purchases (applying offers, if any), etc.

Project Setup

Class:

Register: Singleton class

• Maintains a list of items for sale and their prices.

• Initiates and completes a checkout by returning a total bill amount.

Methods:

Register getinstance()-static method

• String getTotalBill (Map<String,Integer> iternDetails)

Function Description

La

1. Create the function getInstance in Register class. Return the singleton instance of a register class using the register variable

which was declared and initiated to null.

2. Complete the function getTotalBill in the editor below. The function must state what must be returned.

get TotalBill has the following parameter(s):

itemDetails: a key/value pair of string key and integer value



The register contains the list of items and their prices. In this exercise, the list of items and their prices are:

Item |

Price

ALL

1

apple |

2.0

orange |

1.5

mango |

1.2

grape |

1.0

1 20

21

▼Input Format For Custom Testing

It contains the string which have the list of purchased items (fruits) and their

Input Format For Custom Testing

It contains the string which have the list of purchased items (fruits) and their quantity

Note: The order of the fruit's details may vary

▼ Sample Case 0

Sample Input

apple 30 orange 10 mango 20

Sample Output

99.0

Sample Case 1

Sample Input For Custom Testing

orange 10 grape 52

apple 14

Sample Output

95.6
