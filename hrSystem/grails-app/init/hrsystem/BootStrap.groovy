package com.tcerniha

class BootStrap {

    def init = { 

	def manager1 = new Manager(
		fullName: 'Steve Crosbar',
		userName: 'scross',
		password:'secret2018',
		managerEmail: 'scross@email.com',
		office:'B1-900',
		department: 'Grocery'
		).save()
	def manager2 = new Manager(
		fullName: 'Adelle Smeat',
		userName: 'adelle',
		password:'moon2018',
		managerEmail: 'adelle@email.com',
		office:'B1-901',
		department: 'Electronics'
		).save()

	def shift1 = new Shift(
		timeOfDay: 'Morning',
		dayOfWeek: 'Monday', 
		numberOfHours: 8,
		startingTime: '7:00am'
		).save()
         
	def shift2 = new Shift(
		timeOfDay: 'Afternoon',
		dayOfWeek: 'Thursday', 
		numberOfHours: 4,
		startingTime: '12:00am'
		).save()
	
	def teamLeader1 = new TeamLeader(
		fullName: 'Sarah MacDonald',
		department: 'Grocery',
		employeeID: 'TL1111',
		sectionName: 'Bakery',
		officePhone: '01111777',
		leaderEmail: 'smac@email.com',
		password: 'secret',
		manager: manager1		
		).save()  	
             
	def teamLeader2 = new TeamLeader(
		fullName: 'Andrew Smeaton',
		department: 'Elictronics',
		employeeID: 'TL1124',
		sectionName: 'Goods',
		officePhone: '01111787',
		leaderEmail: 'asmeat@email.com',
		password: 'secret',
		manager: manager1 		
		).save()
	def teamLeader3 = new TeamLeader(
		fullName: 'Lizzi Henderson',
		department: 'Electronics',
		employeeID: 'TL1712',
		sectionName: 'TV',
		officePhone: '01111778',
		leaderEmail: 'lhend@email.com',
		password: 'secret1',
		manager: manager2		
		).save() 
	def teamLeader4 = new TeamLeader(
		fullName: 'Adele Simpson',
		department: 'Grocery',
		employeeID: 'TL1172',
		sectionName: 'Bakery',
		officePhone: '01111778',
		leaderEmail: 'lhend@email.com',
		password: 'secret1',
		manager: manager2		
		).save() 
			

	def team1 = new Team(
		teamName: 'Team Loading',
		numberOfEmployees: 12,
		sectionName:'Bakery',
		description:'Loading and unloading deliveries',
		shift: shift1,
		teamLeader: teamLeader1
		).save()

	def team2 = new Team(
		teamName: 'Packing',
		numberOfEmployees: 10,
		sectionName:'Butcher',
		description:'Packing products',
		shift: shift1,
		teamLeader: teamLeader2
		).save()

	def team3 = new Team(
		teamName: 'Picking',
		numberOfEmployees: 14,
		sectionName:'Butcher',
		description:'Picking products',
		shift: shift2,
		teamLeader: teamLeader3
		).save()
	
	def team4 = new Team(
		teamName: 'Testing products',
		numberOfEmployees: 10,
		sectionName:'Bakery',
		description:'testing TV products',
		shift: shift2,
		teamLeader: teamLeader4
		).save()

	
	def task1 = new Task(
		taskName:'Replenishing',
		numberOfPeople: 2,
		sectionName:'Bakery',
		department: 'Grocery',
		timeRequired: '1 hour',
		description: 'Replenishing shelves',
	 	taskCompleted: 'no'		
		).save() 
	def task2 = new Task(
		taskName:'Replenishing',
		numberOfPeople: 2,
		sectionName:'Bakery',
		department: 'Grocery',
		timeRequired: '1 hour',
		description: 'Replenishing shelves',
	 	taskCompleted: 'no'		
		).save() 
	def task3 = new Task(
		taskName:'Replenishing',
		numberOfPeople: 2,
		sectionName:'Butcher',
		department: 'Grocery',
		timeRequired: '2 hour',
		description: 'Replenishing shelves',
	 	taskCompleted: 'no'		
		).save() 

	def employee1 = new Employee(
		fullName: 'Tom Rivers',
		dateOfBirth: new Date('05/05/1999'),
		residence: 'Sheffield',
		horlyRate: 7.5,
	 	employeeID:'E25555',
	 	dateEmployed: new Date('08/05/2017'),
	 	taxCode: 'TX345',
	 	contract:'Full-time',
		teamLeader: teamLeader1,
		manager: manager1,
		shift: shift1,
		team: team1,
		task: task1
		).save()
	def employee2 = new Employee(
		fullName: 'Rebecca Brown',
		dateOfBirth: new Date('04/05/1989'),
		residence: 'Barnsley',
		horlyRate: 7.5,
	 	employeeID:'E25575',
	 	dateEmployed: new Date('08/04/2017'),
	 	taxCode: 'TX345',
	 	contract:'Full-time',
		teamLeader: teamLeader1,
		manager: manager1,
		shift: shift1,
		team: team2,
		task: task1		
		).save()
	def employee3 = new Employee(
		fullName: 'Mike Bren',
		dateOfBirth: new Date('04/07/1998'),
		residence: 'Wakefield',
		horlyRate: 7.5,
	 	employeeID:'E25545',
	 	dateEmployed: new Date('08/02/2018'),
	 	taxCode: 'TX345',
	 	contract:'Full-time',
		teamLeader: teamLeader1,
		manager: manager1,
		shift: shift1,
		team: team4,
		task: task1		
		).save()

	
	manager1.addToTeamLeaders(teamLeader1)
	manager1.addToTeamLeaders(teamLeader2)
       
	team1.addToEmployees(employee1)
	team2.addToEmployees(employee2)
	team4.addToEmployees(employee3)

	teamLeader1.addToEmployees(employee1)
	teamLeader2.addToEmployees(employee2)
	
	manager1.addToEmployees(employee1)
	manager1.addToEmployees(employee2)

	//teamLeader1.addToTeams(team1)
	//teamLeader2.addToTeams(team2)
	//teamLeader3.addToTeams(team3)
	//teamLeader4.addToTeams(team4)

	task1.addToTeams(team1)
	task1.addToTeams(team3)
	
	task1.addToShifts(shift1)
	task2.addToShifts(shift1)
	
	shift1.addToEmployees(employee1)
	shift1.addToEmployees(employee2)

	shift1.addToTeams(team1)
	shift1.addToTeams(team2)
	shift2.addToTeams(team3)

	shift1.addToTasks(task3)
	shift1.addToTasks(task1)

	task1.addToEmployees(employee1)
	task1.addToEmployees(employee2)	
	
	
   }
    def destroy = {
    }
}
