package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoonsInTheWoods = 3;
		int racoonsHeadingHome = 2;
		int racoonsLeftInWoods = racoonsInTheWoods - racoonsHeadingHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowersInTheField = 5;
		int beesBuzzingAbout = 3;
		int differenceOfBees = flowersInTheField - beesBuzzingAbout;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyParkPigeon = 1;
		int friendlyPigeonPal = 1;
		int totalPigeonsEating = lonelyParkPigeon + friendlyPigeonPal;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnTheFence = 3;
		int owlsJoiningTheFun = 2;
		int totalOwlsOnTheFence = owlsOnTheFence + owlsJoiningTheFun;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingHard = 2;
		int beaversPlayingHarder = 1;
		int beaversStillWorking = beaversWorkingHard - beaversPlayingHarder;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansInTheTree = 2;
		int toucansJoiningIn = 1;
		int toucansChillingOnTheTree = toucansInTheTree + toucansJoiningIn;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTheTree = 4;
		int nutsInTheTree = 2;
		int differenceOfSquirrelsOverNuts = squirrelsInTheTree - nutsInTheTree;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double foundQuarter = 0.25;
		double foundDime = 0.10;
		double foundNickel = 0.05;
		double totalAmmountOfMoneyFound = foundQuarter + foundDime + (foundNickel * 2);

		/* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBriersClassMuffins = 18;
		int mrsMacadamsClassMuffins = 20;
		int mrsFlannerysClassMuffins = 17;
		int totalAmmountOfMuffinsMade = mrsBriersClassMuffins + mrsFlannerysClassMuffins + mrsMacadamsClassMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double costOfYoyo = 0.24;
		double costOfWhistle = 0.14;
		double totalAmmountSpent = costOfWhistle + costOfYoyo;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalAmmountOfMarshmallows = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHome = 29;
		int snowAtSchool = 17;
		int differenceInSnow = snowAtHome - snowAtSchool;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double moneyHiltHas = 10.00;
		double costOfToyTruck = 3.00;
		double costOfPencilCase = 2.00;
		double totalAmmountOfMoneyLeft = moneyHiltHas - (costOfPencilCase + costOfToyTruck);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesInCollection = 16;
		int marblesLost = 7;
		int ammountOfMarblesLeft = marblesInCollection - marblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsOwned = 19;
		int seashellsDesired = 25;
		int ammountOfSeashellsNeeded = seashellsDesired - seashellsOwned;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalNumberOfBalloons = 17;
		int numberOfRedBalloons = 8;
		int numberOfGreenBalloons = totalNumberOfBalloons - numberOfRedBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnTheShelf = 38;
		int booksAddedToShelf = 10;
		int totalAmmountOfBooksOnTheShelf = booksOnTheShelf + booksAddedToShelf;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfBees = 8;
		int numberOfLegsOnABee = 6;
		int totalNumberOfLegsInTheAir = numberOfLegsOnABee * numberOfBees;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfOneIceCreamCone = 0.99;
		double totalSpentOnIceCreamCones = costOfOneIceCreamCone * 2;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numberOfRocksNeeded = 125;
		int numberOfRocksOwned = 64;
		int numberOfRocksLeftToGet = numberOfRocksNeeded - numberOfRocksOwned;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numberOfMarblesOwned = 38;
		int numberOfMarblesLost = 15;
		int numberOfMarblesLeft = numberOfMarblesOwned - numberOfMarblesLost;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int distanceToConcert = 78;
		int pitStop = 32;
		int milesLeftToGo = distanceToConcert - pitStop;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeShovelingSnowMorning = 90;
		int timeShovelingSnowAfternoon = 45;
		int totalTimeSpentShoveling = timeShovelingSnowAfternoon + timeShovelingSnowMorning;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double numberOfHotDogs = 6.0;
		double costPerHotDog = 0.50;
		double totalSpentOnHotDogs = numberOfHotDogs * costPerHotDog;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double moneyForPencils = 0.50;
		double costPerPencil = 0.07;
		int numberOfPencilsToBuy = (int) (moneyForPencils / costPerPencil);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalNumberOfButterflies = 33;
		int numberOfOrangeButterflies = 20;
		int numberOfRedButterflies = totalNumberOfButterflies - numberOfOrangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double ammountToSpendOnCandy = 1.00;
		double ammountSpentOnCandy = 0.54;
		double ammountLeftOverFromCandy = ammountToSpendOnCandy - ammountSpentOnCandy;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInTheYard = 13;
		int treesToBePlanted = 12;
		int totalTreesInTheYard = treesInTheYard + treesToBePlanted;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillGrandma = 2;
		int hoursInADay = 24;
		int hoursTillGrandma = daysTillGrandma * hoursInADay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int gumPerPerson = 5;
		int ammountOfGumNeeded = numberOfCousins * gumPerPerson;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyDanHas = 3.00;
		double moneyForCandyBars = 1.00;
		double moneyLeftAfterCandyBar = moneyDanHas - moneyForCandyBars;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int numberOfPeopleInEachBoat = 3;
		int totalPeopleOnTheLake = boatsOnTheLake * numberOfPeopleInEachBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalAmmountOfLegos = 380;
		int legosGoneInTheWind = 57;
		int numberOfLegosLeft = totalAmmountOfLegos - legosGoneInTheWind;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numberOfMuffinsBaked = 35;
		int numberOfMuffinsNeeded = 83;
		int numberOfMuffinsToBake = numberOfMuffinsNeeded - numberOfMuffinsBaked;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numberOfWillysCrayons = 1400;
		int numberOfLucysCrayons = 290;
		int willysCrayonSurplus = numberOfWillysCrayons - numberOfLucysCrayons;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int pagesInTheBook = 22;
		int stickersPerPage = 10;
		int totalNumberOfStickers = pagesInTheBook * stickersPerPage;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double totalAmmountOfCupcakes = 100;
		double numberOfHungryStudents = 8;
		double cupcakesPerStudent = totalAmmountOfCupcakes / numberOfHungryStudents;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int cookiesToDistrubute = 47;
		int cookiesPerJar = 6;
		int cookiesLeftOver = cookiesToDistrubute % cookiesPerJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int totalAmmountOfCroissants = 59;
		int numberOfNeighbors = 8;
		int leftoverCroissants = totalAmmountOfCroissants % numberOfNeighbors;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookiesToPrepare = 276;
		int oatmealCookiesPerTray = 12;
		int traysNeededForCookies = oatmealCookiesToPrepare / oatmealCookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalNumberOfPretzels = 480;
		int pretzelsPerServing = 12;
		int servingsOfPretzels = totalNumberOfPretzels / pretzelsPerServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupCakesBaked = 53;
		int lemonCupCakesPerBox = 3;
		int boxesOfCupCakesGiven = (lemonCupCakesBaked - 2) / lemonCupCakesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksForBreakfast = 74;
		int kidsEatingCarrots = 12;
		int carrotsLeftOver = carrotSticksForBreakfast % kidsEatingCarrots;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int bearsInTheHouse = 98;
		int bearsPerShelf = 7;
		int shelvesWithBears = bearsInTheHouse / bearsPerShelf;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesToSortIntoAlbums = 480;
		int picturesPerAlbum = 20;
		int albumsNeededForPictures = picturesToSortIntoAlbums / picturesPerAlbum;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cardsFoundInTheRoom = 94;
		int cardsPerSmallBox = 8;
		int cardsLeftForTheLast = cardsFoundInTheRoom % cardsPerSmallBox;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksOnTheBookshelves = 210;
		int shelvesForBookHolding = 10;
		int booksPerShelf = booksOnTheBookshelves / shelvesForBookHolding;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissantsToGiveOut = 17;
		double hungryFrenchGuests = 7;
		double croissantsPerGuest = croissantsToGiveOut / hungryFrenchGuests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billsHourlyRate = (12 * 14) / 2.15;
		double jillsHourlyRate = (12 * 14) / 1.9;
		double combinedHourlyRate = billsHourlyRate + jillsHourlyRate;
		double totalSquareFootageOfTheWalls = (12 * 14) * 5;
		double expectedHourlyRate = totalSquareFootageOfTheWalls / combinedHourlyRate;

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = ("Grace");
		String lastName = ("Hopper");
		String middleInitial = ("B");
		String fullName = lastName + ", " + firstName + " " + middleInitial +".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceOfNewYorkAndChicago = 800;
		double milesAlreadyTraveled = 537;
		int percentOfTripCompleted = (int) ((milesAlreadyTraveled / distanceOfNewYorkAndChicago)*100);

	}

}
