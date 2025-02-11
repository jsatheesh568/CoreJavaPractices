	1. Multiple Inheritance

	Create two interfaces: Hockey Team and FootballTeam, and one class: Sport. The Sport class should implement both the interfaces Hockey Team and FootballTeam (Multiple Inheritance).

	The Hockey Team interface must contain the following methods:

	public int calculate HockeyScore();

	public int

	findHighest GoalByIndividualinHockey();

	The FootballTeam must contain the following methods:

	• public int calculateFootballScore()

	• public int find Highest GoalByindividualinFootball();

	Class Sport must contain the variables int[] hockeyPlayers, int[] footballPlayers.

	. Sport(int[] paramHockeyPlayers, int paramFootballPlayers). Constructor takes two arrays as parameters and initializes the empty array hockeyPlayers to store the first 11 integer values, and the empty array footballPlayers to store the last 11 integer values. Assign each value to each element in hockey Players and footballPlayers.

	public int calculate HockeyScore(): Calculate the overall score by adding the scores of all individual hockeyPlayers in the hockey team, and return the overall score as an integer.

	public int calculate FootballScore(): Calculate the overall score by adding the scores of all individual footballPlayers in the football team, and return the overall score as an integer.

	public int findHighest GoalByIndividualinHockey(): Find the highest goal scorer in the hockey team, and return the number of goals scored as an integer.

	• public int findHighest GoalByIndividualinFootball(): Find the highest goal scorer in the football team, and return the number of goals scored as an integer.

	The locked code stub validates the implementation of the Sport class, and the Hockey Team and FootballTeam interfaces.

	Input format for Custom Testing:
	• The first line contains 11 space-separated integers (goals of players in the hockey team).

	• The last line contains 11 space-separated integers (goals of players in the football team).

	Sample Input:

	20 0 0 1 1 0 0 0

	10

	210

	30000000

	Sample Output:

	5

	6

	2

	3
	Output Specification:

	31

	32

	33

	34

	35

	• The first line contains the overall score of the hockey team.

	36

	37

	• The second line contains the overall score of the football team.

	38

	39

	• The third line contains the goals scored by the highest goal scorer in the hockey team.

	40

	• The last line contains the goals scored by the highest goal scorer in the football team.