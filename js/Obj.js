//obj creation by new keyword

const obj=new Object();

obj.name="name";
obj.age=16;
obj.function=function(){return "function"};

let ans="";

for(let i in obj)
{
    ans=ans+obj[i];
}

obj.name="h";

console.log(obj.function()); // Outputs: name16h

//obj creation by object literal

obj1={};

obj1.name="name";
obj1.age=16;

obj1.dispnameage=function(){console.log(this.name,this.age)};

obj1.dispnameage();

//obj creation by constructor

function Person(name,age)
{
    this.name=name;
    this.age=age;
    this.dispname=function(){console.log(name)};
}

const obj2=new Person("name",16);

obj2.dispname();

obj2.dispage=function(){console.log(this.age)};

obj2.dispage();

