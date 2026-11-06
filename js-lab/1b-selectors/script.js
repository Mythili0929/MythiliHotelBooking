// Select by ID
let heading = document.getElementById("heading");

// Select by class
let paragraphs = document.getElementsByClassName("text");

// Select by Tag Name
let button = document.getElementsByTagName("button");

// Select using Query Selector
let firstParagraph = document.querySelector(".text");

// Select using Query Selector All
let allParagraphs = document.querySelectorAll(".text");

console.log("Hello " + heading);
console.log("Hi " + paragraphs);
console.log("Hello APCET " + button);
console.log("Hi friends " + firstParagraph);
console.log("Hello guys " + allParagraphs);
