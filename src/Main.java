import java.util.ArrayList;

import library.Problem;
import problems.*;

public class Main {
	
	//TODO: Figure out how to write this code without suppressing warnings
	
	//static ArrayList<Class<? extends BuggyCode>> buggyCodeArray = new ArrayList<>();
	@SuppressWarnings("rawtypes")
	static ArrayList<Problem> problems = new ArrayList<>();

	static void addProblems() {
		
		Problem<Integer[], Integer> buggy1 = new Problem<>(new Buggy_1());
		buggy1.addCase(new Integer[] {1, 2, 3, 4, 5}, 15);
		buggy1.addCase(new Integer[] {9, 10}, 19);
		buggy1.addCase(new Integer[] {1, 3, 5, 7}, 16);
		buggy1.addCase(new Integer[] {}, 0);
		buggy1.addCase(new Integer[] {0}, 0);		
		problems.add(buggy1);
		
		Problem<Integer[], Integer[]> buggy2 = new Problem<>(new Buggy_2());
		buggy2.addCase(new Integer[] {1, 2, 3}, new Integer[] {3, 2, 1});
		buggy2.addCase(new Integer[] {1, 3, 2}, new Integer[] {2, 3, 1});
		buggy2.addCase(new Integer[] {11, 12, 13}, new Integer[] {13, 12, 11});
		buggy2.addCase(new Integer[] {0, 0, 1}, new Integer[] {1, 0, 0});
		buggy2.addCase(new Integer[] {0, 0}, null);
		problems.add(buggy2);
		
		Problem<Integer[], Integer> buggy3 = new Problem<>(new Buggy_3());
		buggy3.addCase(new Integer[] {1, 2, 3, 4, 5}, 15);
		buggy3.addCase(new Integer[] {2, 3, 5, 7, 11, 13}, 110);
		buggy3.addCase(new Integer[] {1, 3, 5}, 5);
		buggy3.addCase(new Integer[] {}, 0);
		buggy3.addCase(new Integer[] {0}, 0);		
		problems.add(buggy3);
		
		Problem<Integer[], Boolean> buggy4 = new Problem<>(new Buggy_4());
		buggy4.addCase(new Integer[] {1, 2, 3, 4, 1}, false);
		buggy4.addCase(new Integer[] {1, 2, 3, 5, 11, 5, 3, 2, 1}, true);
		buggy4.addCase(new Integer[] {3, 2, 2, 3}, true);
		buggy4.addCase(new Integer[] {1, 2, 2, 1, 1}, false);
		buggy4.addCase(new Integer[] {}, false);		
		problems.add(buggy4);
		
		Problem<Integer[], Integer[]> buggy5 = new Problem<>(new Buggy_5());
		buggy5.addCase(new Integer[] {1, 2, 3, 4, 5}, new Integer[] {5, 4, 3, 2, 1});
		buggy5.addCase(new Integer[] {1, 9, 8, 4}, new Integer[] {4, 8, 9, 1});
		buggy5.addCase(new Integer[] {1, 0, 1}, new Integer[] {1, 0, 1});
		buggy5.addCase(new Integer[] {0}, new Integer[] {0});
		buggy5.addCase(new Integer[] {}, new Integer[] {});
		problems.add(buggy5);
		
		Problem<Integer, Integer> buggy6 = new Problem<>(new Buggy_6());
		buggy6.addCase(0, 1);
		buggy6.addCase(1, 1);
		buggy6.addCase(6, 13);
		buggy6.addCase(15, 987);
		buggy6.addCase(20, 10946);
		problems.add(buggy6);
		
		Problem<Integer[], Boolean> buggy7 = new Problem<>(new Buggy_7());
		buggy7.addCase(new Integer[] {0, 3, 3, 6, 9, 15}, true);
		buggy7.addCase(new Integer[] {1, 1, 2, 3, 5, 8, 13}, true);
		buggy7.addCase(new Integer[] {0, 1, 2, 3, 4, 5}, false);
		buggy7.addCase(new Integer[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 5}, false);
		buggy7.addCase(new Integer[] {}, false);
		problems.add(buggy7);
		
		Problem<String, Integer> buggy8 = new Problem<>(new Buggy_8());
		buggy8.addCase("antidisestablishmentarianism", 11);
		buggy8.addCase("URJ 6 Points Sci Tech Academy", 8);
		buggy8.addCase("sausage", 4);
		buggy8.addCase("syzygy", 0);
		buggy8.addCase("Waluigi", 4);
		problems.add(buggy8);
		
		Problem<Integer[], Boolean> buggy9 = new Problem<>(new Buggy_9());
		buggy9.addCase(new Integer[] {1, 2, 3, 2, 3, 3}, false);
		buggy9.addCase(new Integer[] {1, 2, 3, 3, 3}, true);
		buggy9.addCase(new Integer[] {3, 2, 2, 2, 3, 3, 3, 3, 3}, true);
		buggy9.addCase(new Integer[] {2, 2, 3, 3}, true);
		buggy9.addCase(new Integer[] {}, false);		
		problems.add(buggy9);
		
		Problem<String[], String[]> buggy10 = new Problem<>(new Buggy10());
		buggy10.addCase(new String[] {"to", "be", "or", "not", "to", "be"}, new String[] {"be", "to", "to", "be", "or", "not"});
		buggy10.addCase(new String[] {"a", "b", "c", "d", "e", "f"}, new String[] {"f", "e", "a", "b", "c", "d"});
		buggy10.addCase(new String[] {"URJ", "6", "Points", "Sci", "Tech", "Academy"}, new String[] {"Academy", "Tech", "URJ", "6", "Points", "Sci"});
		buggy10.addCase(new String[] {"Fortnite bad"}, new String[] {"Fortnite bad"});
		buggy10.addCase(new String[] {"Minecraft good"}, new String[] {"Minecraft good"});
		problems.add(buggy10);
		
		Problem<Integer, Integer> buggy11 = new Problem<>(new Buggy11());
		buggy11.addCase(0, 1);
		buggy11.addCase(1, 1);
		buggy11.addCase(6, 13);
		buggy11.addCase(15, 987);
		buggy11.addCase(20, 10946);
		problems.add(buggy11);
		
		Problem<Integer, Integer> buggy12 = new Problem<>(new Buggy12());
		buggy12.addCase(0, 1);
		buggy12.addCase(5, 120);
		buggy12.addCase(7, 5040);
		buggy12.addCase(10, 3628800);
		buggy12.addCase(12, 479001600);
		problems.add(buggy12);
		
		Problem<String, Boolean> buggy13 = new Problem<>(new Buggy13());
		buggy13.addCase("The number 66 is sp00ky", false);
		buggy13.addCase("111 + 555 = 666", true);
		buggy13.addCase("Chris has played Wah for 666 years", true);
		buggy13.addCase("Roblox meh", false);
		buggy13.addCase("", false);
		problems.add(buggy13);
		
		Problem<Integer, Integer> buggy14 = new Problem<>(new Buggy14());
		buggy14.addCase(0, 3);
		buggy14.addCase(1, 1);
		buggy14.addCase(3, 1);
		buggy14.addCase(6, 2);
		buggy14.addCase(8, 5);
		problems.add(buggy14);
		
		Problem<Integer, Integer> buggy15 = new Problem<>(new Buggy15());
		buggy15.addCase(50, 44);
		buggy15.addCase(100, 44);
		buggy15.addCase(400, 188);
		buggy15.addCase(1000, 798);
		buggy15.addCase(4000000, 4613732);
		problems.add(buggy15);
		
	}

	public static void main(String[] args) {

		addProblems();
		
		for (Problem<?, ?> problem : problems) {
			
			problem.checkCases();
		
		}

	}

}