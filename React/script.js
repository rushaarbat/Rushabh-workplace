//************************** */
// console.log(a);
// //var a;
// var a= 10;
// //let b;
// let b = 20;
// console.log(b);
// {
//     var c = 10;
//     console.log(c);
//     let d= 20;
//     console.log(d);
// }
// console.log(c);
// console.log(d);

//*********************************
//*****constant******

// const a= 10;
// // const b;   //error
//  //a= 20;  //error
// console.log(a);
// const myArr = {
// //  //5000
//   name: "Ankur",
// };
// // //myArr=500
// // myArr.name = "Ankush";
// // myArr = {  //error
// //    name: "Ankit",
// // };
// console.log(myArr);

//********string***********

// let myString1 = "abc@xyz.com";
// let myString2 = "Abc@xyz.com";

// console.log(myString1.toUpperCase() === myString2.toUpperCase());
// //o/p--> true
// for (let i=0; i<myString1.length;i++){
//     console.log(myString1(i));
// }

//print only repeat charactor

// let input = "abcdafgaadbjc";
// let output = "";
// for (let i=0; i<input.length;i++)
// {
//     let count=0;
//      for (j=0;j<input.length;j++){reverseValue
// break;
//       }
//       }   
//      }
// }
// }
// console.log(output);

//********Array***************/

// //let myArr = [1,2,3,4,5,"my String",["A","b"]];
// let myArr = [1,2,3,4,5,];
// let myArr1 = [1,2,3,4,5];
// isSame = true;
// for( let i =0;i<myArr.length;i++){
//     if (myArr[i] !== myArr1){
//         isSame  = false;
//         break;
//     }
// }
// console.log(myArr === myArr1); //false
// console.log(isSame);//false


//***************/

// let input ="india is my country";
// //output= "aidni si ym yrtnuoc"
// output ="";

// function reverseString(value){
//     let returnValue = "";
//     for(let i=value.length-1;i>-1;i--){
//         returnValue = returnValue + value[i];
//     }
//     return returnValue;
// }
// let wordString = "";
// for (let i =0;i<input.length;i++){
//     //rev=rev+input.charAt

// if (input[i]  === " "){
//     output = output + reverseString(wordString) + " ";
//     console.log(wordString);
//     wordString = "";

//     continue;
// }
// else{
//     wordString = wordString + input[i];
//     if (i + 1 === input.length){
//         output = output + reverseString(wordString);
//         console.log(wordString)
//         wordString = "";
//     }
    
// }

// }
// console.log(output);

//********function*************/

// // normal function  
// console.log(addNumber(10,20));
// console.log(addNumber);
// function addNumber(number1, number2){
//     return number1+number2 ;
// }


// // function Expression
// const addNumber2 = function (number1,number2){
//     return number1 + number2;
// }
// console.log(addNumber2(10,20));
// console.log(addNumber2);


// //arrow function 

const addNumberArrow = (number1,number2)=>{
    return number1 + number2; }
console.log(addNumberArrow(10,20));
 console.log(addNumberArrow);


//*******constructor********/

// //this
// const myObject = {
//     //1000
//     name: "akshay",
//     getName: function(){
//         return this.name;
//     },
// };
// const myNewObject = {
//      //2000
//     name: "ankur",
   
// };
// //myObject = getName=> 1000
// //newGetName=> 2000
// const newGetName = myObject.getName.bind(myNewObject);
// console.log(myObject.getName());  //akshay
// console.log(newGetName());//ankur



//**************contructor function*******/

// function Person(name, age){
//     //check if called with new keyword
//     if(!new.target){
//         return new Person(name ,age);
//     }
//     //this ={}//aadded interenally
// this.name=name;
// //this.number = 1234;

//     this.age= age;
//     //return { name};//return { name :name}
// //return 1234;//not allowed
// //return this;// added internally


// }
// const personObject = new Person("ankush",22);
// const personObject1 = Person("ankyur",29);//same outpit as above
// console.log(personObject);
// console.log(personObject1);

//***********Destructuring*********/
// const myArr = [1, 2, 3, 4];
// // const a = myArr[0];
// // const b = myArr[1];
// // const c = myArr[2];
// // const d = myArr[3];
// const [a, c, b, d] = myArr; //sequence is very important
// console.log(a, b, c, d);
// const myObject = {
//   name: "Ankur",
//   age: 29,
// };
// // const name = myObject.name;
// // const age = myObject.age;
// const { age, name } = myObject; //sequence is not important
// console.log( age);

//******************* Spreade Operateor************************** */
// const myArr = [1,2,3,4,5];//1000
// const myArrNew = []; //2000                    //old way
// for (let i= 0;i< myArr.length; i++){
//   myArrNew.push(myArr[i]);
// }
// console.log(myArr);
// console.log(myArrNew);
// myArr.push(6);
// console.log(myArr);
// console.log(myArrNew);

//or

// const myArr = [1,2,3,4,5];//1000
// const myArrNew = [...myArr];
// console.log(myArr);
// console.log(myArrNew);
// myArr.push(6);
// console.log(myArr);
// console.log(myArrNew);

// const myObject  = {   
//   name : "ankur",
//   age:29,
// };
// const myObjectNew = [...myObject];
// console.log(myObject);
// console.log(myObjectNew);
// myObject.push("ram");
// console.log(myObject);
// console.log(myObjectNew);

//************rest************** */

// function addNumbers(...args){
//   const args = [10,20,30,40,50 ];  //intrnally
//   let result = 0;
//   for (let i=0;i< args.length; i++) {                //without rest
//     result += args[i];  //same as result = result + args[i]
    
//       }
//       return result ;
      //return a+b+c+d+e ;
//}
//or


function addNumbers(...args){
  //const args = [10,20,30,40,50 ];  //intrnally
  let result = 0 ;
  for (let i=0;i< args.length; i++) {
result += args[i];  //same as result = result + args[i]

  }
  return result;

}
console.log(addNumbers(10,20,30,40));
