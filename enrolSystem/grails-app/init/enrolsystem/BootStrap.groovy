package com.enrol

class BootStrap {

    def init = { servletContext -> 
	def computing = new Course(
		title:'BSc Hon Computing',
		code:'COMP234',
		leader:'Dr Mary Poppins',
		department:'Computing',
		startDate:new Date('11/11/2016'),
		endDate:new Date('11/11/2020'),
		numberOfStudents:45,
		descripton:'''Add some text here''',
		tuitionFees:9000,
		studyMode:'Full-time'
	).save()
	def system = new Module(
		title:'Systems Arch',
		code:'SA567',
		credits:'1',
		lecturer:'Dr Sue Jenkins',
		course:'BSc Hons Computing',
		description:'Module includes working with virtual machines'
	).save()
	def lectut = new Lecturer(
		fullName:'Dr Joe Bloggs',
		post:'post',
		subject:'Computing',
		lecturerEmail:'bloggs@gmail.com',
		office:'Charles St',
		bio:'I am a lecturer'
	).save()

    }
    def destroy = {
    }
}
