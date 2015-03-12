# voting-system
the electronic voting system for carleton university


(for development)
The server 1 Request/Reply form 

// -----request form : "[flag]:[value]"
// ---[flag] = 1 , [value] = [flag2]:[userName]:[lastName]:[firstName]:[address]:[password] (regist account, flag2 = 1 is voter, flag2 = 2 is candidate)
	Example
	1:1:usrName:ln:fn:addr:pwd//voter
	1:2:usrName:ln:fn:addr:pwd//candidate

// ---[flag] = 2 , [value] = [userName]:[candidateUserName] (voting)
// ---[flag] = 3 , [value] = [userName]:[password] (login)
// ---[flag] = 4 , [value] = null (get candidate list)
// ---[flag] = 5 , [value] = [userName] (logout the server1)
// ---[flag] = 6 , [value] = [userName] (check the voter vote state)

// -----reply form : "[flag]:[value]"
// ---[flag] = 1 , [value] = string (error message)
// ---[flag] = 2 , [value] = success
// ---[flag] = 3 , [value] = [candidate name]:[candidate name]:... (candidate name consist of [userName]:[FirstName]:[LastName])
// ---[flag] = 4 , [value] = [flag2]:[candidateFirstName]:[candidateLastName] (check the voter vote state) [flag2] = 1 (voter hasn't vote) , [flag2] = 2 (voter already vote and return the candidate name)

The server 2 Request/Reply form 
// -----request form : "[flag]:[value]"
// ---[flag] = 1 , [value] = null (get all the candidate polls)
// ---[flag] = 2 , [value] = [district name] (get the candidate polls depends on the district)

// -----reply form : "[flag]:[value]"
// ---[flag] = 1 , [value] = string (error message)
// ---[flag] = 2 , [value] = [candidateFirstName]:[candidateLastName]:[polls]:...... (get all the candidate polls)
// ---[flag] = 3 , [value] = [candidateFirstName]:[candidateLastName]:[polls]:...... (get the candidate polls depends on the district)
