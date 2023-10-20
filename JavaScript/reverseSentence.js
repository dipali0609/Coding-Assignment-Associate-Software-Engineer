// Q.2.A. Take a sentence as an input and reverse every word in that sentence.a. Example - This is a sunny day > shiT si a ynnus yad. 
var string = "This is a sunny day";
var reverseallstrings = reverseWord(string,"");
// console.log(reverseallstrings);

var output = reverseWord(reverseallstrings," ");
console.log(output);

function reverseWord(string,separator){
  return string.split(separator).reverse().join(separator);
}
