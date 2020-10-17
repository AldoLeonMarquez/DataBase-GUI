	//Add This with the other varibale declarations 
	
	private String FN1 ="";
	private String LN1="";
	private String FN2="";
	private String LN2="";
	int S1 = 0;
	int S2 = 0;
	private int nPlayersSQ2 = 0;			
				//Add this in the SQ2AddTeam action funtion
				//~Line774
				if(nPlayersSQ2 == 2) {
					 nPlayersSQ2 = 0;
					 S1 =0;
					 S2=0;
				}
				else if(nPlayersSQ2 == 0){
					S1 = PlayersSQ2.getSelectedIndex();
					//System.out.println(S1);
					FN1 = PlayerNames.get(S1);
					LN1 = PlayerLastNames.get(S1);
					nPlayersSQ2++;
				}
				else if(nPlayersSQ2 == 1){
					S2 =PlayersSQ2.getSelectedIndex();
					//System.out.println(S2);
					FN2 = PlayerNames.get(S2);
					LN2 = PlayerLastNames.get(S2);
					nPlayersSQ2++;
				}
				//Insert This Lines int the SQ2Result action function
				//~Line800
				ArrayList<String> HomeTown = new ArrayList<String>();
				ArrayList<String> TeamCode = new ArrayList<String>();
				ArrayList<String> TeamAgainst1 = new ArrayList<String>();
				ArrayList<String> TeamAgainst2 = new ArrayList<String>();
				ArrayList<String> Year1 = new ArrayList<String>();
				ArrayList<String> Year2 = new ArrayList<String>();
				ResultSet result;
				ResultSetMetaData rsmd;
				//System.out.println(Query);
				String HT1=""; //Home town Name 1
				String HT2=""; //Home town Name 2
				String TC1=""; //Team code 1
				String TC2=""; //Team code 2
				String Query3 = "SELECT \"Hometown\", \"Team Code\" FROM \"Player\" ";
				try{
				   //create a statement object
				   Statement stmt = conn.createStatement();
				   //create an SQL statement
				   //String sqlStatement = "SELECT * from \"Conference\"";
				   String sqlStatement = Query3;
			       //send statement to DBMS
			       result = stmt.executeQuery(sqlStatement);
			       rsmd = result.getMetaData();
			       while (result.next()) {
			    	     HomeTown.add(result.getString("Hometown"));
			    	     TeamCode.add(result.getString("Team Code"));
			       }
			     } catch (Exception b){
			    	 System.out.println("Error accessing Database.");
			         //e.printStackTrace();
			    }
				HT1 = HomeTown.get(S1);
				TC1 = TeamCode.get(S1);
				HT2 = HomeTown.get(S2);
				TC2 = TeamCode.get(S2);
				if(HT1.equals(HT2)) {
					System.out.println("Same Hometown!");
					return;
				}
				String TeamName = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TC1;
				String TeamName2 = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TC2;
				//System.out.println(stm);
				String TN1 = ""; //Team Name 1
				String TN2 = ""; //Team Name 2
				
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = TeamName2;
				       //send statement to DBMS
				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd2 = result2.getMetaData();
				       int	N = rsmd2.getColumnCount();
				       result2.next();
			           TN1 = result2.getString(rsmd2.getColumnName(1));
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = TeamName;
				       //send statement to DBMS
				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd2 = result2.getMetaData();
				       int	N = rsmd2.getColumnCount();
				       result2.next();
			           TN2 = result2.getString(rsmd2.getColumnName(1));
			           
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 	if(TC1.equals(TC2)){
				 		System.out.println("Same Team");
				 		//Print Team names etc
				 		//System.out.println(TN1 +" "+TN2);
				 		return;
				 	}
				 	
				 	String Ateam1 = "SELECT \"Visit Team Code\", \"Home Team Code\", \"Date\" FROM \"Game\"";
				 	Ateam1 += " WHERE (\"Visit Team Code\" = " + TC1 +")";
				 	Ateam1 += " Or (\"Home Team Code\" = "+ TC1  +")";
				 	String Ateam2 = "SELECT \"Visit Team Code\", \"Home Team Code\", \"Date\" FROM \"Game\"";
				 	Ateam2 += " WHERE (\"Visit Team Code\" = " + TC2 +")";
				 	Ateam2 += " Or (\"Home Team Code\" = "+ TC2  +")";
				 	try{
					     //create a statement object
					       Statement stmt = conn.createStatement();
					       //create an SQL statement
					       //String sqlStatement = "SELECT * from \"Conference\" where false;";
					       String sqlStatement = Ateam1;
					       //send statement to DBMS
					       ResultSet result2 = stmt.executeQuery(sqlStatement);
					       ResultSetMetaData rsmd2 = result2.getMetaData();
					       int	N = rsmd2.getColumnCount();
					       while(result2.next()) {
					    	   String t1 = result2.getString(rsmd2.getColumnName(1));
					    	   String t2 = result2.getString(rsmd2.getColumnName(2));
					    	   if(t1.equals(TC1)) { 
					    		   TeamAgainst1.add(t2); 
					    	   }
					    	   else {
					    		   TeamAgainst1.add(t1); 
					    	   }
					    	   Year1.add(result2.getString(rsmd2.getColumnName(3)));  
					       }   
					   } catch (Exception b){
					     System.out.println("Error accessing Database.");
					     //e.printStackTrace();
					   }
				 	try{
					     //create a statement object
					       Statement stmt = conn.createStatement();
					       //create an SQL statement
					       //String sqlStatement = "SELECT * from \"Conference\" where false;";
					       String sqlStatement = Ateam2;
					       //send statement to DBMS   	
					       ResultSet result2 = stmt.executeQuery(sqlStatement);
					       ResultSetMetaData rsmd2 = result2.getMetaData();
					       int	N = rsmd2.getColumnCount();
					       while(result2.next()) {
					    	   String t1 = result2.getString(rsmd2.getColumnName(1));
					    	   String t2 = result2.getString(rsmd2.getColumnName(2));
					    	   if(t1.equals(TC1)) {
					    		   TeamAgainst2.add(t2); 
					    	   }
					    	   else {
					    		   TeamAgainst2.add(t1); 
					    	   } 
					       }
				           
					   } catch (Exception b){
					     System.out.println("Error accessing Database.");
					     //e.printStackTrace();
					   }
				 	String Date1 = "";
				 	String Date2 = "";
				 	String TCN = "";
				 	String TeamInCommon="";
				 	for (int i = 0;i<TeamAgainst1.size();i++) {
				    	   for(int j = 0;j<TeamAgainst2.size();j++) {	    		   
				    		   String F = TeamAgainst1.get(i);
				    		   String G = TeamAgainst2.get(j);  
				    		   if(F.equals(G)) {
				    			   TCN = G;
				    			   Date1 = Year1.get(i);
				    			   Date2 = Year2.get(j);
				    			   String TeamName3 = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TCN;
				    			   try{
				  				     //create a statement object
				  				       Statement stmt = conn.createStatement();
				  				       //create an SQL statement
				  				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				  				       String sqlStatement = TeamName3;
				  				       //send statement to DBMS
				  				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				  				       ResultSetMetaData rsmd2 = result2.getMetaData();
				  				       int	N = rsmd2.getColumnCount();
				  				       result2.next();
				  			           TeamInCommon = result2.getString(rsmd2.getColumnName(1));
				  			         String Out = PlayerNames.get(S1) + PlayerLastNames.get(S1)+ " played for " + TN1;
				  			         Out += " which played against " + TeamInCommon +" in "+ Date1 + ",";
				  			         Out += " which played against "+TN2+ " in "+ Date2 + " which has " + PlayerNames.get(S2)  + PlayerLastNames.get(S2) + "on their team.";
				  			         System.out.println(Out);
				  			         return;
				  				   } catch (Exception b){
				  				     System.out.println("Error accessing Database.");
				  				     //e.printStackTrace();
				  				   }
				    		   }
				    	   }
				 	}