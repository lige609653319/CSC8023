create table person(
    NINo primary key,fName,lName,DoB,Age
)

create table country(
    ISOCode primary key,name,DialCode
)

create table county(
    countryISOCode,name,area
    PRIMARY KEY(countryISOCode, name),
    FOREIGN KEY(countryISOCode) REFERENCES country(ISOCode),
)

create table team(
TeamID,name,PlayerID
PRIMARY KEY TeamID
FOREIGN KEY(PlayerID) REFERENCES player(PlayerID),
)

create table player(
PlayerID,fName,lName
PRIMARY KEY PlayerID
)

create table person(
    NINo primary key,fName,lName
)

create table hobby(
    NINo primary key,hobbyName
    FOREIGN KEY(NINo) REFERENCES player(NINo),
)

create table instructor(
    InstructorID primary key,fName,lName
)

create table course(
    code primary key,title,duration,InstructorID
    FOREIGN KEY(InstructorID) REFERENCES instructor(InstructorID)
)

create table courseRelation(
PrerequisiteCourseId,courseId
FOREIGN KEY(PrerequisiteCourseId) REFERENCES course(code)
FOREIGN KEY(courseId) REFERENCES course(code)
)

create table DIVISION(
    DIVISIONID primary key,name
)

create table Staff(
    StaffID primary key,fName,lName,JoinDate,DIVISIONID,supervisorId
    FOREIGN KEY(DIVISIONID) REFERENCES DIVISION(DIVISIONID)
    FOREIGN KEY(supervisorId) REFERENCES Staff(StaffID)
)

create table module(
    moduleId primary key,title,StaffID
    FOREIGN KEY(StaffID) REFERENCES Staff(StaffID)
)

create table paper(
    paperId primary key,title,venue,PublicationYear,StaffID
    FOREIGN KEY(StaffID) REFERENCES Staff(StaffID)
)