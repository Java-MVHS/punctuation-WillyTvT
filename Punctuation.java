/* William Tang
 * 12/11/2024
 * Punctiation.java
 * 
 * Pseudo code
 * import scanner
 * class Punctuation 
 * //no constructor
 * main()
 * create object of itself
 * call searchIt
 * 
 * searchIt()
 * creates String puncword 
 * puncword = call getPunctuationWords()
 * call printWords(puncword); 
 * 
 * getPunctuationWords()
 * print spaces
 * D&I String for message 
 * D&I string for individual word
 * D&I string for punctuation word
 * D&I string for final phrase 
 * D&I char splitChar used to split the message into chars 
 * D&I int startSpace and endSpace 
 * D&I String length and find message length 
 * for loop that runs same amount of times as amount of chars in message 
 * message.charAt(x) 
 * if statement to find words
 * get end space and start space to find chars in bewteen, merge with substring 
 * call checkForPunctuation 
 * return final message 
 * 
 * checkForPunctuation()
 * String punctuation with all punctuation i.e. ?"!
 * compare each char with punctuation
 * if one char has punctuation than return it
 * 
 * printWords()
 * Print final message
 */

import java.util.Scanner; //Import scanner
public class Punctuation	//creates Punctuation class
{
	public static void main(String[] args)		//main method
	{
		Punctuation p = new Punctuation(); 		//Punctuation object
		p.searchIt();							//Call searchIt(); 
	}
	public void searchIt()		//searchIt method
	{
		String punctuationWords = new String ("");		//D&I 
		punctuationWords = getPunctuationWords();		//call getPunctuationWords
		printWords(punctuationWords);					//Call printWords
	}
	public String getPunctuationWords()		//getPunctiationWords method 
	{
		System.out.print("\n\n\n");		//beginning back spaces 
		String message = new String("Blood, Sweat, and Tears by Winston Churchill " +		//Message
"May 13, 1940 " +
"Mr. Speaker: " +
"On Friday evening last I received His Majesty’s commission to form a new " +
"Administration. It was the evident wish and will of Parliament and the " +
"nation that this should be conceived on the broadest possible basis and that it should " + 
"include all parties, both those who supported the late Government and also the parties " + 
"of the Opposition. " +
"I have completed the most important part of this task. A War Cabinet has " +
"been formed of five Members, representing, with the Liberal Opposition, the unity of the " +
"nation. The three party Leaders have agreed to serve, either in the War Cabinet or in " +
"high executive office. The three Fighting Services have been filled. It was necessary " +
"that this should be done in one single day, on account of the extreme urgency and " +
"rigour of events. A number of other key positions were filled yesterday, and I am " +
"submitting a further list to His Majesty tonight. I hope to complete the appointment of the " +
"principal Ministers during tomorrow. The appointment of the other Ministers usually " +
"takes a little longer, but I trust that, when Parliament meets again, this part of my task " +
"will be completed, and that the Administration will be complete in all respects. " +
"Sir, I considered it in the public interest to suggest that the House should " +
"be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " +
"accordance with the powers conferred upon him by the Resolution of the House. At the " +
"end of the proceedings today, the Adjournment of the House will be proposed until " +
"Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " +
"business to be considered during that week will be notified to Members at the earliest " +
"opportunity. I now invite the House, by the Resolution which stands in my name, to " +
"record its approval of the steps taken and to declare its confidence in the new " +
"Government. " +
"Sir, to form an Administration of this scale and complexity is a serious " +
"undertaking in itself, but it must be remembered that we are in the preliminary stage of " +
"one of the greatest battles in history, that we are in action at many points in Norway and " +
"in Holland, that we have to be prepared in the Mediterranean, that the air battle is " +
"continuous and that many preparations have to be made here at home. In this crisis I " +
"hope I may be pardoned if I do not address the House at any length today. I hope that " +
"any of my friends and colleagues, or former colleagues, who are affected by the political " +
"reconstruction, will make all allowances for any lack of ceremony with which it has been " +
"necessary to act. I would say to the House, as I said to those who’ve joined this " +
"government: \"I have nothing to offer but blood, toil, tears and sweat.\" " +
"We have before us an ordeal of the most grievous kind. We have before " +
"us many, many long months of struggle and of suffering. You ask, what is our policy? I " +
"will say: It is to wage war, by sea, land and air, with all our might and with all the " +
"strength that God can give us; to wage war against a monstrous tyranny, never " +
"surpassed in the dark and lamentable catalogue of human crime. That is our policy. You " +
"ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in " +
"spite of all terror, victory, however long and hard the road may be; for without victory, " +
"there is no survival. Let that be realised; no survival for the British Empire, no survival " +
"for all that the British Empire has stood for, no survival for the urge and impulse of the " +
"ages, that mankind will move forward towards its goal. " +
"But I take up my task with buoyancy and hope. I feel sure that our cause " +
"will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, " +
"and I say, \"Come then, let us go forward together with our united strength.\" ");
		String individualWord = new String(""); 	//D&I 
		String punctuationWord = new String("");	//D&I 
		String finalPhrase = new String("");		//D&I 
		char charSplit = ' ';			//D&I 
		int startSpace = 0; 		//D&I 
		int endSpace = 0;		//D&I 
		int stringLength = message.length(); 		//D&I -- gets number of chars in message
		for(int x = 0; x<stringLength; x++)		//For loop, checks every char for spaces to find words 
		{
			charSplit = message.charAt(x); 		//gets individual char
			if (charSplit==(' '))		//finds words 
			{
				endSpace = x;			//gets endSpace
				individualWord = message.substring(startSpace, endSpace); 		//Get's word in bewteen both spaces
				startSpace = x;		//start space 
				punctuationWord = checkForPunctuation(individualWord); 		//Calls checkForPunctuation
				finalPhrase = finalPhrase.concat(punctuationWord);		//Connects words with punctuation
			}
			System.out.print("\n\n\n");		//ending backspaces 
		}
		return finalPhrase;			//returns final phrase 
	}
	public String checkForPunctuation(String word)		//checkForPunctuation String method 
	{
		String punctuation = ".,/?';()\"\'-_!:*&^%$#@{}`~|";		//D&I All punctuation 
		for( int x = 0; x < word.length(); x++)					//For loop, runs amount of time there are chars in word 
		{
		for (int y = 0; y < punctuation.length(); y++) 		//checks each char for punctuation 
		{
			if (word.charAt(x) == punctuation.charAt(y))		//if a char is a punctuation return word 
				return word; 	//return word
		}
	}
	return "";		//if word doesn't have punctuation return nothing
	}
	public void printWords(String finalWords)		//printWords method 
	{
		System.out.print(finalWords + " ");		//prints final words 
	}
}
		
