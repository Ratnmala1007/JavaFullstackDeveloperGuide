// console.log("Hello,I am learning js");  // print statement

// //----------variable   

// /*global variable
// full_name="Ratnmala";
// age=26; 
// console.log(full_name);
// console.log(age);  

// //let var
// let a=10;//let var global scope
// {
//     let a=100;  // let var block scope
//     console.log(a);

// }
// console.log(a);*/


// const student = {   //object define
//     fullName : "Ratnmalas",
//     age : 25,
//     cgpa : 8.2,
//     ispass : true,
// };

// student["age"] = student["age"]+1;

// console.log(student["cgpa"]);
// console.log(student["age"]);
// console.log(student.fullName);
// console.log(student["ispass"]);


// /*loop in js -------
// if else*/
// let score=prompt("enter your score");
// let grade;
// if(score >= 90 && score <=100){
//     grade = "A";

// }
// else if(score >= 70 && score <=89){
//     grade = "B";
    
// }else if(score >= 60 && score <=69){
//     grade = "C";
    
// }else if(score >= 50 && score <=59){
//     grade = "D";
    
// }
// else if (score <50){
//     grade = "Fail";
    
// }
// console.log("your score is ",grade);


// let obj = {
// item : "pen",
// price :10

// };
// console.log("the price of ",obj.item ,"is",obj.price);

// ///////generate username ---String

// let full_name = prompt("enter your fullName");
// console.log(full_name);

// let username="@"+full_name + full_name.length;

// console.log("username is ",username);


// ///////////Arrays//////////////
// let num=[12,23,3,4,45,65];
// console.log(num.length);
// console.log(num);

// /////////Functions//////////
// // function sum(x,y){
// //     console.log(x + y);

// // }
// // sum (2,3);
// // let str = "Hello\tWorld";
// // console.log(str);

// // let rev=str.split("").reverse().join("");
// //     console.log(rev);
// //////////functions//////////////
// function vowel(str) {
//     let count=0;
// for (const char of str) {
//     if(char== 'a'|| char=='e'|| char =='i'|| char=='o'||char=='u'){
// count++;    
// }

// } 
// return(count);  
// }
// ////////////forEach/////////
// let nums =[1,2,3,4,5];
// nums.forEach((num) => {
//     console.log(num*num);
// });
// let n=prompt("enter a num:");
// let arr =[];
// for(let i=1;i<=n;i++){

//     arr[i-1]=i;
// }
// console.log(arr);

// let sum=arr.reduce((res,curr) => {
//     return res + curr;
// });
// console.log(sum);
// let fact=arr.reduce((res,curr) => {
//     return res * curr;
// });
// console.log(fact);
// console.dir(document.body);
// console.log(document.body);
// console.log(document.head);
// console.log(document.scripts);
// let firstEl=document.querySelector("#myid")
// console.dir(firstEl);
// let h1=document.querySelector("h1");
// console.dir(h1.innerText);
// h1.innerText=h1.innerText + " important concept";
// let divs = document.querySelectorAll(".box");
// let idx = 1;
// for(div of divs){
//     div.innerText = `new unique value adding ${idx}`;
//     idx++;
// //console.log(div.innerText);

// }

// let newheading = document.createElement("h1");
// newheading.innerHTML = "<i> Hi,I am new!</i>";
// document.querySelector("body").prepend(newheading);

// let newButton = document.createElement("button");
// newButton.innerText = "click me";
// newButton.style.color = "white";
// newButton.style.backgroundColor = "red";
// document.querySelector("body").prepend(newButton);


// let para = document.querySelector("p");
// let btn1= document.querySelector("#btn1");
// btn1.onclick = ()=>{
//     console.log("btn1 was clicked");
//     let a=20;
//     a++;
//     console.log(a);
// }
let modeBtn = document.querySelector("#mode");

let currMode = "light";
modeBtn.addEventListener("click",() => {
    if(currMode == "light"){
        currMode = "dark";
        document.querySelector("body").style.backgroundColor = "black";
    }
    else{
        currMode = "light";
                document.querySelector("body").style.backgroundColor = "white";

    }
console.log(currMode);
});