import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Application {

	static // Variables declaration
			ArrayList<Integer> mailList;
			static String sendDestination;
			static String recruitmentDestination = "recruitment@parkshark.com";
			static String spamDestination = "spam@parkshark.com";
			static String salesDestination = "sales@parkshark.com";
			static String receptionDestination = "reception@parkshark.com";
			
			static Integer recruitmentCounter;
			static Integer spamCounter;
			static Integer salesCounter;
			static Integer receptionCounter;
			static Integer mailCounter;
			
			static int daylyRecruitmentCounter = 0;
			static int daylySpamCounter = 0;
			static int daylySalesCounter = 0;
			static int daylyReceptionCounter = 0;
			static int daylyMailCounter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		mailList = new ArrayList<Integer>();
		
		int counter = 0;
		while (counter < 3) {
			initCounters();
			getRandomNumber(mailList);
			
			for(int number: mailList) {
				switch(number) {
				case 1:
				case 4:
					sendDestination = recruitmentDestination;
					recruitmentCounter++;
					break;
				case 2:
				case 5:
					sendDestination = spamDestination;
					spamCounter++;
					break;
				case 3:
				case 6:
				case 9:
					sendDestination = salesDestination;
					salesCounter++;
					break;
				default:
					sendDestination = receptionDestination;
					receptionCounter++;
					break;
				}
				
				mailCounter++;
				
				System.out.println("Number = " + number + " : " + sendDestination);
				TimeUnit.SECONDS.sleep(1);
				
				//mailList.remove(number);
			}
			
			printReport(mailCounter,recruitmentCounter,spamCounter,salesCounter,receptionCounter);
			mailList.clear();
			counter++;
			updateDaylyCounters();
			
			/*daylyMailCounter = daylyMailCounter + mailCounter;
			daylyRecruitmentCounter = daylyRecruitmentCounter + recruitmentCounter;
			daylySpamCounter = daylySpamCounter + spamCounter;
			daylySalesCounter = daylySalesCounter + salesCounter;
			daylyReceptionCounter = daylyReceptionCounter + receptionCounter;*/
		}
		
		printReport(daylyMailCounter, daylyRecruitmentCounter, daylySpamCounter, daylySalesCounter, daylyReceptionCounter);

	}
	
	public static void getRandomNumber(ArrayList<Integer> list) {
		int min = 0;
		int max = 10;
		int randomNumber;
		
		for (int i = 0; i < 10; i++) {
			randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
			list.add(randomNumber);
		}
		
		randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
	}
	
	public static void initCounters() {
		recruitmentCounter = 0;
		spamCounter = 0;
		salesCounter = 0;
		receptionCounter = 0;
		mailCounter = 0;
	}
	
	public static void initDaylyCounters() {
		daylyRecruitmentCounter = 0;
		daylySpamCounter = 0;
		daylySalesCounter = 0;
		daylyReceptionCounter = 0;
		daylyMailCounter = 0;
	}
	
	public static void updateDaylyCounters() {
		daylyMailCounter += mailCounter;
		daylyRecruitmentCounter += recruitmentCounter;
		daylySpamCounter += spamCounter;
		daylySalesCounter += salesCounter;
		daylyReceptionCounter += receptionCounter;
	}
	
	public static void printReport(int mailCnt,int recruitmentCnt,int spamCnt,int salesCnt,int receptionCnt) {
		System.out.printf("We have sorted %d mails:\n",mailCnt);
		System.out.printf("\t %d to recruitment\n\t %d to spam\n\t %d to sales\n\t %d to reception\n",recruitmentCnt,spamCnt,salesCnt,receptionCnt);
		System.out.println();
	}

}
