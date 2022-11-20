public class Main {
        public static void main(String[] args) {
          // Letters and Numbers String
          String[] myNums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
          String[] myNumsii = {"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
          String[] myNumsiii = {"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
          String[] myLets = {"a", "b", "c" , "d"};
          String[] myNumerals = {"i","ii","iii","iv","v","vi"};
          String[] myNumeralsii = {"vii","viii","ix","x","xi","xii"};
          String fullstop = ".";
          String space = " ";
          // 1
          String one = myNums[0];
          // (a)
          String a = myLets[0];
          String onea = one + a;
          // (b)
          String b = myLets[1];
          String oneb = one + b;
          // 2
          String two = myNums[1];
          // 3
          String three = myNums[2];
          // 4
          String four = myNums[3];
          String fourone = myNumerals[0];
          String fourtwo = myNumerals[1];
          String fouri = four + fourone;
          String fourii = four + fourtwo;
          // 5
          String five = myNums[4];
          String fiveone = myNumerals[0];
          String fivetwo = myNumerals[1];
          String fivea  = myLets[0];
          String fiveaa = five + fivea;
          String fiveb = myLets[1];
          // (a)
          String fiveai = fiveaa + fiveone;
          String fiveaii = fiveaa + fivetwo;
          // (b)
          String fivebb = five + fiveb;
          String fivebi = fivebb + fiveone;
          String fivebii = fivebb + fivetwo;
          // 6
          // (a)
          String six = myNums[5];
          String sixa = myLets[0];
          String sixb = myLets[1];
          String sixaa = six + sixa;
          String sixi = myNumerals[0];
          String sixii = myNumerals[1];
          String sixiii = myNumerals[2];
          String sixiv = myNumerals[3];
          String sixv = myNumerals[4];
          String sixvi = myNumerals[5];
          String sixai = sixaa + sixi;
          String sixaii = sixaa + sixii;
          String sixaiii = sixaa + sixiii;
          String sixaiv = sixaa + sixiv;
          String sixav = sixaa + sixv;
          String sixavi = sixaa + sixvi;
          // (b)
          String sixbb = six + sixb;
          String sixbi = sixbb + sixi;
          String sixbii = sixbb + sixii;
          // 7
          // (a)
          String seven = myNums[6];
          String sevena = myLets[0];
          String sevenb = myLets[1];
          String seveni = myNumerals[0];
          String sevenii = myNumerals[1];
            String seveniii = myNumerals[2];
          String seveniv = myNumerals[3];
            String sevenv = myNumerals[4];
          String sevenvi = myNumerals[5];
          String sevenaa = seven + sevena;
          String sevenai = sevenaa + seveni;
          String sevenaii = sevenaa + sevenii;
          // (b)
          String sevenbb = seven + sevenb;
          String sevenbia = sevenbb + seveni + sevena;
          String sevenbib = sevenbb + seveni + sevenb;
          String sevenbiia = sevenbb + sevenii + sevena;
          String sevenbiib = sevenbb + sevenii + sevenb;
          String sevenbiiia = sevenbb + seveniii + sevena;
          String sevenbiiib = sevenbb + seveniii + sevenb;
          String sevenbiva = sevenbb + seveniv + sevenb;
          String sevenbivb = sevenbb + seveniv + sevena;
          String sevenbva = sevenbb + sevenv + sevenb;
          String sevenbvb = sevenbb + sevenv + sevena;
          String sevenbvia = sevenbb + sevenvi + sevena;
          String sevenbvib = sevenbb + sevenvi + sevenb;
	  // 8
	  String eight = myNums[7];
	  String eighti = myNumerals[0];
	  String eightii = myNumerals[1];
          String eightiii = myNumerals[2];
	  String eighta = myLets[0];
	  String eightb = myLets[1];
	  // (a)
	  String eightai = eight + eighta + eighti;
	  String eightaii = eight + eighta + eightii;
	  // (b)
	  String eightbi = eight + eightb + eighti;
	  String eightbii = eight + eightb + eightii;
          String eightbiii = eight + eightb + eightiii;
	  String eightbiia = eightbii + eighta;
	  String eightbiib = eightbii + eightb;
	  String eightbiiia = eightbiii + eighta;
	  String eightbiiib = eightbiii + eightb;
          // 9
          String nine = myNums[8];
          String ninea = myLets[0];
          String nineb = myLets[1];
          String ninei = myNumerals[0];
          String nineii = myNumerals[1];
          String nineiii = myNumerals[2];
          String nineiv = myNumerals[3];
          String ninev = myNumerals[4];
          String ninevi = myNumerals[5];
          String ninevii = myNumeralsii[0];
          String nineviii = myNumeralsii[1];
          String nineaa = nine + ninea + ninei;
          String ninebb = nine + nineb;
          String ninebia = ninebb + ninei + ninea;
          String ninebib = ninebb + ninei + nineb;
          String ninebiia = ninebb + nineii + ninea;
          String ninebiib = ninebb + nineii + nineb;
          String ninebiiia = ninebb + nineiii + ninea;
          String ninebiiib = ninebb + nineiii + nineb;
          String ninebiva = ninebb + nineiv + ninea;
          String ninebivb = ninebb + nineiv + nineb;
          String ninebva = ninebb + ninev + ninea;
          String ninebvb = ninebb + ninev + nineb;
          String ninebvia = ninebb + ninevi + ninea;
          String ninebvib = ninebb + ninevi + nineb;
          String ninebviia = ninebb + ninevii + ninea;
          String ninebviib = ninebb + ninevii + nineb;
          String ninebviiia = ninebb + nineviii + ninea;
          String ninebviiib = ninebb + nineviii + nineb;
          // 10
          String ten = myNums[9];
          String teni = myNumerals[0];
          String tenii = myNumerals[1];
          // i & ii
          String tenone = ten + teni;
          String tentwo = ten + tenii;
          // 11
          String eleven = myNumsii[0];
	  String eleveni = myNumerals[0];
	  String elevenii = myNumerals[1];
	  String eleveniii = myNumerals[2];
	  String eleveniv = myNumerals[3];
	  // i & ii
	  String elevenone = eleven + eleveni;
	  String eleventwo = eleven + elevenii;
	  String eleventhree = eleven + eleveniii;
	  String elevenfour = eleven + eleveniv;          
          // 12
          String twelve = myNumsii[1];
	  String twelvei = myNumerals[0];
	  String twelveii = myNumerals[1];
	  String twelveiii = myNumerals[2];
	  String twelveiv = myNumerals[3];
	  // i & ii
	  String twelveone = twelve + twelvei;
	  String twelvetwo = twelve + twelveii;
	  String twelvethree = twelve + twelveiii;
	  String twelvefour = twelve + twelveiv;
          // 13
          String thirteen = myNumsii[2];
          String thirteeni = myNumerals[0];
          String thirteenii = myNumerals[1];
          String thirteeniii = myNumerals[2];
	  // i & ii
	  String thirteenone = thirteen + thirteeni;
	  String thirteentwo = thirteen + thirteenii;
	  String thirteenthree = thirteen + thirteeniii;     
          // 14
          String fourteen = myNumsii[3];
          String fourteeni = myNumerals[0];
          String fourteenii = myNumerals[1];
	  // i & ii
	  String fourteenone = fourteen + fourteeni;
	  String fourteentwo = fourteen + fourteenii; 
          // 15
          String fifteen = myNumsii[4];
          String fifteena = myLets[0];
          String fifteenb = myLets[1];
          String fifteenc = myLets[2];
          String fifteend = myLets[3];
          String fifteeni = myNumerals[0];
          String fifteenii = myNumerals[1];
          // a, b, c ( i & ii)
          String fifteenaa = fifteen + fifteena;
          String fifteenbb = fifteen + fifteenb;
          String fifteencc = fifteen + fifteenc;
          String fifteendd = fifteen + fifteend;
          String fifteenone =  fifteeni;
          String fifteentwo =  fifteenii;
          // Conjugated Version - a, b, c (i & ii)
          String fifteenai = fifteenaa + fifteenone;
          String fifteenaii = fifteenaa + fifteentwo;
          String fifteenbi = fifteenbb + fifteenone;
          String fifteenbii = fifteenbb + fifteentwo;
          String fifteenci = fifteencc + fifteenone;
          String fifteencii = fifteencc + fifteentwo;
          String fifteendi = fifteendd + fifteenone;
          // 16
          String sixteen = myNumsii[5];
          String sixteeni = myNumerals[0];
          String sixteenii = myNumerals[1];
          // i & ii
          String sixteenone = sixteen + sixteeni;
          String sixteentwo = sixteen + sixteenii;
          // 17
          String seventeen = myNumsii[6];
          String seventeeni = myNumerals[0];
          String seventeenii = myNumerals[1];
          // i & ii
          String seventeenone = seventeen + seventeeni;
          String seventeentwo = seventeen + seventeenii;
          // 18
          String eighteen = myNumsii[7];
          String eighteeni = myNumerals[0];
          String eighteenii = myNumerals[1];
          // i & ii
          String eighteenone = eighteen + eighteeni;
          String eighteentwo = eighteen + eighteenii;
          // 19
          String nineteen = myNumsii[8];
          String nineteeni = myNumerals[0];
          String nineteenii = myNumerals[1];
          // i & ii
          String nineteenone = nineteen + nineteeni;
          String nineteentwo = nineteen + nineteenii;
          // 20
          String twenty = myNumsii[9];
          String twentyi = myNumerals[0];
          String twentyii = myNumerals[1];
          String twentyiii = myNumerals[2];
          // i & ii
          String twentyaone = twenty + twentyi;
          String twentyatwo = twenty + twentyii;
          String twentyathree = twenty + twentyiii;
          /// 21 
          String twentyone = myNumsiii[0];
	  // Integers : 1
          int mPs = 1000;
          int sPm = 60;
          int mPh = 60;
          int hPd = 24;
          // 1
          // (a)
          String no1a = " How many minutes are there in a day? ";
          int ans1a = mPh * hPd;
          String oneafull = onea + fullstop + no1a + ans1a;
          System.out.println(oneafull);
          // (b)
          String no1b = " How many miliseconds are there in a day? ";
          int no1bi = mPs * sPm;
          int no1bii = no1bi * mPh;
          int no1biii = no1bii * hPd;
          String onebfull = oneb + fullstop+ no1b + no1biii;
          System.out.println(onebfull);
          // 2
          boolean gaj = true;
          String gajs = " Is Alvin good at java? ";
          System.out.println(two + fullstop  + gajs + gaj);
          // 3
          String greeting = " Hello ";
          String firstname = "Alvin ";
          String secondname = "Chweya";
          String answer = ", your answer is: ";
          String fullname =  firstname + secondname;
          int ogn = 98888899;
          int ans3 = ogn / 2;
          String fullsentence = three + fullstop + greeting + fullname + answer + ans3;
          System.out.println(fullsentence);
          //  4
          int time = 14;
          if (time < 10){
          System.out.println(fouri + fullstop + greeting + fullname + ", Good Morning");
          System.out.println(fourii + fullstop + "Time Status: " + time);
                  } else if (time < 20) {
          System.out.println(fouri + fullstop + greeting + fullname +  ", Good afternoon");
          System.out.println(fourii + fullstop +" Time Status: " + time);
                  } else {
          System.out.println(fouri + fullstop + greeting + fullname +  ", Good evening");
          System.out.println(fourii + fullstop + "Time Status: " + time);
                  }
          // 5
          // (a)
          boolean jojoanca = false;
          String butmoved = " Yes, it still exists but has been moved to a different location from Darad, Ukunda.";
          String butmovedfull = fiveaii + fullstop + butmoved;
          String left = " Sorry, but it was closed in 2020.";
          String leftfull = fiveaii + fullstop + left;
          String q5a = "Does Jojoanca exist anymore?";
          String q5afull = fiveai + fullstop + q5a;
          System.out.println(q5afull);
          if (jojoanca){
          System.out.println(butmovedfull);
                } else {
          System.out.println(leftfull);
                  }
          // (b)
          String q5b = " According to the codebase, how many total s are there? ";
          String ans = " 14";
          String q5bfull = fivebi + fullstop + q5b;
          String ansfull = fivebii + fullstop + ans;
          System.out.println(q5bfull);
          System.out.println(ansfull);
          // 6
          // (a)
          String q6a = "Work out the following:";
          String q6ai = " 256 * 4 = ";
          int q6aians = 256 * 4;
          String q6aifull = sixai + fullstop + q6ai + q6aians;
          String q6afull = sixaa + fullstop + q6a;
          System.out.println(q6afull);
          System.out.println(q6aifull);
          String q6aii = " 512 * 8 = ";
          int q6aiians = 512 * 8;
          String q6aiifull = sixaii + fullstop + q6aii + q6aiians;
          System.out.println(q6aiifull);
          String q6aiii = " 4096 * 4 = ";
          int q6aiiians = 4096 * 4;
          String q6aiiifull = sixaiii + fullstop + q6aiii + q6aiiians;
          System.out.println(q6aiiifull);
          String q6aiv = " 256 * 8 = ";
          int q6aivans = 256 * 8;
          String q6aivfull = sixaiv + fullstop + q6aiv + q6aivans;
          System.out.println(q6aivfull);
          String q6av = " 128 / 4 = ";
          int q6avans = 128 / 4;
          String q6avfull = sixav + fullstop + q6av + q6avans;
          System.out.println(q6avfull);
          String q6avi = " 16 / 32 = ";
          int q6avians = 16 * 32;
          String q6avifull = sixavi + fullstop + q6avi + q6avians;
          System.out.println(q6avifull);
          // (b)
          String q6b = " What is the sum of the answers of numbers 6a i - vi? ";
          int ans6b = q6aians +  q6aiians + q6aiiians + q6aivans + q6avans + q6avians;
          String q6bfull = sixbi + fullstop + q6b;
          String ans6bfull = sixbii + fullstop + ans6b;
          System.out.println(q6bfull);
          System.out.println(ans6bfull);
         // 7
         // (a)
         boolean gajii = true;
          String q7 = "What are you good at?";
         String q7full = sevenai + fullstop + q7;
         String ans7i = "Java";
         String ans7ii = "Nothing";
         String ans7ifull = sevenaii + fullstop + ans7i;
         String ans7iifull = sevenaii + fullstop + ans7ii;
         System.out.println(q7full);
         if (gajii){
        System.out.println(ans7ifull);
         } else {
         System.out.println(ans7iifull);
         }
         // (b)
         String[] myFrenchArray = {"Un","Deux","Trois","Quatre","Cinq","Six","Sept","Huit","Neuf","Dix","Onze","Douze"};
        String q7b = "What is the numbers 1 - 12 in French";
        String q7bfull = sevenbb + fullstop + q7b;
        String ans7b1 = myFrenchArray[0];
        String ans7b2 = myFrenchArray[1];
        String ans7b3 = myFrenchArray[2];
        String ans7b4 = myFrenchArray[3];
        String ans7b5 = myFrenchArray[4];
        String ans7b6 = myFrenchArray[5];
        String ans7b7 = myFrenchArray[6];
        String ans7b8 = myFrenchArray[7];
        String ans7b9 = myFrenchArray[8];
        String ans7b10 = myFrenchArray[9];
        String ans7b11 = myFrenchArray[10];
        String ans7b12 = myFrenchArray[11];
        String ans7b1full = sevenbia + fullstop + ans7b1;
        String ans7b2full = sevenbib + fullstop + ans7b2;
        String ans7b3full = sevenbiia + fullstop + ans7b3;
        String ans7b4full = sevenbiib + fullstop + ans7b4;
        String ans7b5full = sevenbiiia + fullstop + ans7b5;
        String ans7b6full = sevenbiiib + fullstop + ans7b6;
        String ans7b7full = sevenbiva + fullstop + ans7b7;
        String ans7b8full = sevenbivb + fullstop + ans7b8;
        String ans7b9full = sevenbva + fullstop + ans7b9;
        String ans7b10full = sevenbvb + fullstop + ans7b10;
        String ans7b11full = sevenbvia + fullstop + ans7b11;
        String ans7b12full = sevenbvib + fullstop + ans7b12;
        System.out.println(q7bfull);
        System.out.println(ans7b1full);
        System.out.println(ans7b2full);
        System.out.println(ans7b3full);
        System.out.println(ans7b4full);
        System.out.println(ans7b5full);
        System.out.println(ans7b6full);
        System.out.println(ans7b7full);
        System.out.println(ans7b8full);
        System.out.println(ans7b9full);
        System.out.println(ans7b10full);
        System.out.println(ans7b11full);
        System.out.println(ans7b12full);
	// 8
	// (a)
	boolean chillin = false;
	String q8a = "Are you chilling?";
	String iam = "Yes, I am chilling.";
	String iamnot = "Trying to, but it is hard.";
        String iamfull = eightaii + fullstop + iam;
	String iamnotfull = eightaii + fullstop + iamnot;
	String q8afull = eightai + fullstop + q8a;
	System.out.println(q8afull);
        if (chillin){
	System.out.println(iamfull);
	} else{
	System.out.println(iamnotfull);
	}
	// (b)
        String[] myFriends = {"Alvin", "Yohan" , "Nigel" , "Jayden"};
	String name = "Alvin";
	String q8b = "What is your name?";
	String legendi = "Legendary Name, same as the person who made this (and friends)! (";
	String legendii = ")";
	String normali = "Sweet name (";
	String normalii = ")";
	String q8bfull = eightbi + fullstop + q8b;
        String legendfulla = eightbiia + fullstop + legendi + name + legendii;
        String legendfullb = eightbiib + fullstop + legendi + name + legendii;
        String legendfullc = eightbiiia + fullstop + legendi + name + legendii;
        String legendfulld = eightbiiib + fullstop + legendi + name + legendii;
        String normalfulla = eightbiia + fullstop + normali + name + normalii;
        String normalfullb = eightbiib + fullstop + normali + name + normalii;
        String normalfullc = eightbiiia + fullstop + normali + name + normalii;
        String normalfulld = eightbiiib + fullstop + normali + name + normalii;
        System.out.println(q8bfull);
        if(name == myFriends[0]){
        System.out.println(legendfulla);
        } else{
        System.out.println(normalfulla);
        }
        if(name == myFriends[1]){
         System.out.println(legendfullb);
        } else{
        System.out.println(normalfullb);
        }
        if(name == myFriends[2]){
        System.out.println(legendfullc);
        } else{
        System.out.println(normalfullc);
        }
        if(name == myFriends[3]){
        System.out.println(legendfulld);
        } else{
        System.out.println(normalfulld);
        }
        // 9
        // (a)
       int[] myNumberArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 16384, 32768, 65536};
       int ans9ia = myNumberArray[0];
       int ans9ib = myNumberArray[1];
       int ans9iia = myNumberArray[2];
       int ans9iib = myNumberArray[3];
       int ans9iiia = myNumberArray[4];
       int ans9iiib = myNumberArray[5];
       int ans9iva = myNumberArray[6];
       int ans9ivb = myNumberArray[7];
       int ans9va = myNumberArray[8];
       int ans9vb = myNumberArray[9];
       int ans9via = myNumberArray[10];
       int ans9vib= myNumberArray[11];
       int ans9viia = myNumberArray[12];
       int ans9viib = myNumberArray[13];
       int ans9viiia = myNumberArray[14];
       int ans9viiib = myNumberArray[15];
       // (b)
       String q9 = "What are the numbers which are normally associated with Drive space?";
       String q9full = nineaa + fullstop + q9;
       String ans9iafull = ninebia + fullstop + ans9ia;
       String ans9ibfull = ninebib + fullstop + ans9ib;
       String ans9iiafull = ninebiia + fullstop + ans9iia;
       String ans9iibfull = ninebiib + fullstop + ans9iib;
       String ans9iiiafull = ninebiiia + fullstop + ans9iiia;
       String ans9iiibfull = ninebiiib + fullstop + ans9iiib;
       String ans9ivafull = ninebiva + fullstop + ans9iva;
       String ans9ivbfull = ninebivb + fullstop + ans9ivb;
       String ans9vafull = ninebva + fullstop + ans9va;
       String ans9vbfull = ninebvb + fullstop + ans9vb;
       String ans9viafull = ninebvia + fullstop + ans9via;
       String ans9vibfull = ninebvib + fullstop + ans9vib;
       String ans9viiafull = ninebviia + fullstop + ans9viia;
       String ans9viibfull = ninebviib + fullstop + ans9viib;
       String ans9viiiafull = ninebviiia + fullstop + ans9viiia;
       String ans9viiibfull = ninebviiib + fullstop + ans9viiib;
       System.out.println(q9full);
       System.out.println(ans9iafull);
       System.out.println(ans9ibfull);
       System.out.println(ans9iiafull);
       System.out.println(ans9iibfull);
       System.out.println(ans9iiiafull);
       System.out.println(ans9iiibfull);
       System.out.println(ans9ivafull);
       System.out.println(ans9ivbfull);
       System.out.println(ans9vbfull);
       System.out.println(ans9viafull);
       System.out.println(ans9vibfull);
       System.out.println(ans9viiafull);
       System.out.println(ans9viibfull);
       System.out.println(ans9viiiafull);
       System.out.println(ans9viiibfull);
       System.out.println(ans9vafull);
       // 10
       String q10 = "What is a random number in the myNumberArray[], you may choose.";
       int ans10 = myNumberArray[11];
       String q10full = tenone + fullstop + q10;
       String ans10full = tentwo + fullstop + ans10;
       System.out.println(q10full);
       System.out.println(ans10full);
       // 11
       int x = 0;
       int y = 6;
       int z = x * y;
       String statement11 = "(STATEMENT) When I had this idea, I was in class learning about Flow-Charts. Had to make some changes so, enjoy my implementations!";
       String q11 = "Make a program that asks the user to divide x by y and if the result is less than 5 then refuse to divide";
       String ans11i = "You cannot multiply a number under 5";
       String ans11ii = "Your number has been mutiplied: ";
       String ans11iif = ans11ii + z;
       String statement11full = elevenone + fullstop + statement11;
       String q11full = eleventwo + fullstop + q11;
       String ans11ifull = eleventhree + fullstop + ans11i;
       String ans11iifull = elevenfour + fullstop + ans11i;
       String ans11iiifull = eleventhree + fullstop + ans11iif;
       String ans11ivfull = elevenfour + fullstop + ans11iif;
       System.out.println(statement11full);
       System.out.println(q11full);
       if(x < 5){
        System.out.println(ans11ifull);
       } else {
        System.out.println(ans11iiifull);
       }       
       if(y < 5){
        System.out.println(ans11iifull);
       } else {
        System.out.println(ans11ivfull);
       }       
       // 12
       int xa = 0;
       int ya = 6;
       int za = xa + ya;
       int aa = za / 2;
       String statement12 = "(STATEMENT) When I had this idea, I was doing my Computer Science Homework, had to make some changes so, enjoy my implementations!";
       String q12 = "Make a program that gets xa and ya and the sum is xa (x) + ya (y) = za (z) and the Average (aa (a)) = za (z) / 2";
       String ans12i = "You have your average:";
       String ans12ii = "You have your sum: ";
       String statement12full = twelveone + fullstop + statement12;
       String q12full = twelvetwo + fullstop + q12;
       String ans12ifull = twelvethree + fullstop + ans12i + aa;
       String ans12iifull = twelvefour + fullstop + ans12ii + za;
       System.out.println(statement12full);
       System.out.println(q12full);
       System.out.println(ans12ifull);
       System.out.println(ans12iifull);
       // 13
       int ab = 1;
       int bb = 2;
       int cc = ab + bb;
       String statement13 = "(STATEMENT) I wasn't doing something when I got this idea, but I took 2 pseudo-codes (for next 7 questions) and turned it into java, had to make some changes so enjoy my implementations";
       String q13 = "Make a program that adds a + b.";
       String ans13 = "Your answer to a + b = c = ";
       String statement13full = thirteenone + fullstop + statement13;
       String q13full = thirteentwo + fullstop + q13;
       String ans13full = thirteenthree + fullstop + ans13 + cc;
       System.out.println(statement13full);
       System.out.println(q13full);
       System.out.println(ans13full);
       // 14
       String namea = "Alvin";
       String q14 = "Enter your name";
       String ans14 = "Your name is:";
       String q14full = fourteenone + fullstop + q14;
       String ans14full = fourteentwo + fullstop + ans14 + namea; 
       System.out.println(q14full);
       System.out.println(ans14full);
       // 15
       String nameaa = "Alvin";
       String namebb = "Maranx";
       String namecc = "II";
       String q15a = "What is your first-name";
       String q15b = "What is your second-name";
       String q15c = "What is your third-name";
       String q15d = "Your full name is:";
       String q15de = q15d + space + nameaa + space + namebb + space + namecc;
       String q15afull = fifteenai + fullstop + q15a;
       String q15bfull = fifteenbi + fullstop + q15b;
       String q15cfull = fifteenci + fullstop + q15c;
       String ans15afull = fifteenaii + fullstop + nameaa; 
       String ans15bfull = fifteenbii + fullstop + namebb; 
       String ans15cfull = fifteencii + fullstop + namecc;
       String ans15dfull = fifteendi + fullstop + q15de;
       System.out.println(q15afull); 
       System.out.println(ans15afull); 
       System.out.println(q15bfull); 
       System.out.println(ans15bfull); 
       System.out.println(q15cfull); 
       System.out.println(ans15cfull); 
       System.out.println(ans15dfull); 
       // 16
       String q16 = "Enter your marks!";
       int marks = 100;
       String phrasei = "Your marks are";
       String phraseii = "And you:";
       String phraseiii = "PASSED";
       String phraseiv = "FAILED";
       String q16full = sixteenone + fullstop + q16;
       String passedfull = sixteentwo + fullstop + phrasei + space + marks + space + phraseii + space + phraseiii;
       String failedfull = sixteentwo + fullstop + phrasei + space + marks + space + phraseii + space + phraseiv;
       System.out.println(q16full);
       if (marks > 50){
       System.out.println(passedfull);
       } else {
       System.out.println(failedfull);
       }
       // 17
       int xx = 256;
       int yy = 2;
       int quotient = xx / yy;
       String q17 = "Enter two numbers!";
       String error = "Error, Cannot divide under 5";
       String ans17 = "The answer is:";
       String ans17f = ans17 + quotient;
       String q17full = seventeenone + fullstop + q17;
       String errorfull = seventeentwo + fullstop + error;
       String ans17full = seventeentwo + fullstop + space + ans17f;
       System.out.println(q17full);
       if(quotient < 5){
        System.out.println(errorfull);
       } else {
        System.out.println(ans17full);
       }
       // 18
       int reward[] = {10000 , 5000, 2500};
       int position[] = {1, 2, 3};
       int pos1 = position[0]; 
       int pos2 = position[1]; 
       int pos3 = position[2]; 
       int rew1 = reward[0];
       int rew2 = reward[1];
       int rew3 = reward[2];
       int athpos = pos1;
       String q18 = "What is your name and position?";
       String nameaaa = "AC";
       String phrase1 = "You were no.";
       String phrase2 = "Congratulations, your reward is:";
       String pos1phrase = greeting + nameaaa + space + phrase1 + space + pos1 + space + phrase2 + rew1;
       String pos2phrase = greeting + nameaaa + space + phrase1 + space + pos2 + space + phrase2 + rew2;
       String pos3phrase = greeting + nameaaa + space + phrase1 + space + pos3 + space + phrase2 + rew3;
       String q18full = eighteenone + fullstop + q18;
       String posphrase1f = eighteentwo + fullstop + pos1phrase;
       String posphrase2f = eighteentwo + fullstop + pos2phrase;
       String posphrase3f = eighteentwo + fullstop + pos3phrase;
       System.out.println(q18full);
       if(athpos == pos1){
        System.out.println(posphrase1f);
       }       
       if(athpos == pos2){
        System.out.println(posphrase2f);
       }       
       if(athpos == pos3){
        System.out.println(posphrase3f);
       }
       // 19
       String grades[] = {"A", "B","C","D","E"};
       String star = "*";
       int mat = 96;
       int eng = 90;
       int art = 98;
       int kis = 99;
       int bio = 81;
       int phy = 81;
       int che = 82;
       int bus = 99;
       int csc = 100;
       int his = 99;
       int geo = 75;
       String grade1 = grades[0];
       String grade1f = grade1 + star;
       String grade2 = grades[0];
       String grade3 = grades[1];
       String grade4 = grades[2];
       String grade5 = grades[3];
       String grade6 = grades[4];
       int avi = 10;
       int avii = mat + eng + kis + bio + phy + che + bus + art + csc + his + geo;
       int aviii = avii / avi;
       String q19 = "Enter your name, And your Marks.";
       String nameab = "Maranx";
       String phrase1a = "Aaand, your average marks are:";
       String phrase1b = "And, your average means you got an:";
       String phrase1c = "Your marks combined are:";
       String avphrase1 = greeting + nameab + space + phrase1c + space + avii + space + phrase1a + space + aviii + space + phrase1b + space + grade1f;
       String avphrase2 = greeting + nameab + space + phrase1c + space + avii + space + phrase1a + space + aviii + space + phrase1b + space + grade2;
       String avphrase3 = greeting + nameab + space + phrase1c + space + avii + space + phrase1a + space + aviii + space + phrase1b + space +  grade3;
       String avphrase4 = greeting + nameab + space + phrase1c + space + avii + space +  phrase1a + space + aviii + space + phrase1b + space +  grade4;
       String avphrase5 = greeting + nameab + space + phrase1c + space + avii + space +  phrase1a + space + aviii + space + phrase1b + space +  grade5;
       String avphrase6 = greeting + nameab + space + phrase1c + space + avii + space +  phrase1a + space + aviii + space + phrase1b + space +  grade6;
       String q19f = nineteenone + fullstop + q19;
       String avphrase1f = nineteentwo + fullstop + avphrase1;
       String avphrase2f = nineteentwo + fullstop + avphrase2;
       String avphrase3f = nineteentwo + fullstop + avphrase3;
       String avphrase4f = nineteentwo + fullstop + avphrase4;
       String avphrase5f = nineteentwo + fullstop + avphrase5;
       String avphrase6f = nineteentwo + fullstop + avphrase6;
       System.out.println(q19f);
       if(aviii == 100){
        System.out.println(avphrase1f);
       }
       if(avii == 90){
        System.out.println(avphrase2f);
       }
       if(avii == 70){
        System.out.println(avphrase3f);
       }
       if(avii ==  60){
        System.out.println(avphrase4f);
       }
       if(avii == 50){
        System.out.println(avphrase5f);
       }
       if(avii == 40){
        System.out.println(avphrase6f);
       }
       // 20
       int spm = 60;
       int mph = 60;
       int hpd = 24;
       int dpy = 365;
       int sph = spm * mph;
       int spd = sph * hpd;
       int userspd = 31536000;
       int ans20 = userspd / spd;
       String q20 = "Please enter the amount of seconds, and name - and we will convert into days";
       String nameac = "Maranx";
       String undererrori = ", cannot convert to days, if under 86400.";
       String undererrorii = "You entered:";
       String converted = ", we were able to convert your seconds to days, and the answer was:";
       String convertedii = "We found that your answer that is shown above is Over a year (";
       String convertediii = ")";
       String days = "days";
       String convertedf = greeting + nameac + converted + space + ans20 + space + days;
       String overayearf = greeting + nameac + space + convertedii + ans20 + space + days + convertediii;
       String undererrorf = greeting + nameac + undererrori + space + undererrorii + space + userspd;
       String q20full = twentyaone + fullstop + q20;
       String convertedfull = twentyatwo + fullstop + convertedf;
       String undererrorfull = twentyatwo + fullstop + undererrorf;
       String overayearfull = twentyathree + fullstop + overayearf;
       System.out.println(q20full);
       if (userspd < spd){
        System.out.println(undererrorfull);
       } else {
        System.out.println(convertedfull);
       }
       if(userspd > dpy){
        System.out.println(overayearfull);
       }
          // Show Code
          boolean showcode = true;
          String showcodesi = "Show Code";
          String showcodesiii = "(";
          String code = "code";
          String showcodesii = ")";
          String helpout = "Help Out on Github! ";
          String repo = "maranxlee/PureInJava";
          String codef = showcodesiii + code + showcodesii;
          String showcodesfull = helpout + repo + codef;
          String showcodefull = showcodesi + showcodesiii + showcode + showcodesii;
          System.out.println(showcodefull);
          if (showcode){
          System.out.println(showcodesfull);
                  } else {
                 }
              }
          }
