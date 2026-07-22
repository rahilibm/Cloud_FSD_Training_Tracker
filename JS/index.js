console.log("Learning JS");

// This is comment

let a = 5;
let b=43;

console.log(a+b);

let c;

console.log(a+b+" "+c);
console.log(a+b,c);

if(a<b){
    console.log("hi");
}else if(a>b){
    console.log("Yes");
}else{
    console.log("Equals");
}

let i =0;

for(i=0;i<4;i++){
    console.log(i);
}

i=0;
while(i<5){
    i++;
    console.log("Hello ",i)
}

do{
    i--;
    console.log("Hello ",i);
}while(i>2);

let arr=["Rahil",12,undefined,null,true];

// VALUES
for (let e of arr){
    console.log(e);
}

// INDEXES
for(let e in arr){
    console.log(e);
}

function sum(a,b){
    return a+b;
}

// let is block scope
// var is functional scope
console.log(sum(12,13))


let l=5;
var v=6;
{
    let l=10;
    var v=20;
    console.log("inside block: ",l);
    console.log("inside block: ",v);
}

console.log("outside block: ",l);
console.log("outside block: ",v);

arr.forEach(function(w){
    console.log(w);
})

arr.forEach(e=>console.log(e));

let s=(a,b)=> a+b;

console.log(s(1,3));

console.log(s);

let acc=1;
for(let i =1;i<5;i++){
    console.log(acc*=i);
}