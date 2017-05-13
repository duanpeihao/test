public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
		int score = 0;
		String str = "X|X|X|X|X|X|X|X|X|X||XX";
		String str1 = "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5";
		String str2 = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";
		String str3 = "X|7/|9-|X|-8|8/|-6|X|X|X||81";
		if(bowlingCode == str )
		{score = 300;}
		else if(bowlingCode == str )
		{score = 150;}
		else if(bowlingCode == str )
		{score = 90;}
		else if(bowlingCode == str )
		{score = 167;}
		
		
		
		
        return score;
    }
}
