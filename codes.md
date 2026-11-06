
<!DOCTYPE html>
<html>
<head>
  <title>Select Elements</title>
</head>
<body>
  <center>Right click and see Inspect element - Console or press F12.</center>
  <h2 id="heading">JavaScript DOM</h2>
  <p class="text">Paragraph 1</p>
  <p class="text">Paragraph 2</p>
  <button>Click Me</button>
  <script src="script.js"></script>
</body>
</html>
```

### script.js
```javascript
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
```

**Output:** Right click and see Inspect element - Console or press F12
```
JavaScript DOM
Paragraph 1
Paragraph 2
[Click Me]
```

---

## 1(c) Event Listeners

### index.html
```html
<!DOCTYPE html>
<html>
<head>
  <title>Event Listener</title>
</head>
<body>
  <button id="btn">Click Here</button>
  <script>
    let button = document.getElementById("btn");
    button.addEventListener("click", function () {
      alert("Button clicked!");
    });
  </script>
</body>
</html>
```

**Output:** A "Click Here" button. When it is clicked, "Button clicked!" appears in a popup.

---

## 12) Three Types of Functions

### i) Function Declaration (index.html)
```html
<!DOCTYPE html>
<html>
<head>
  <title>Function Declaration</title>
  <script>
    function greet() {
      console.log("Hello, Students! from Function Declaration");
    }
  </script>
</head>
<body>
  <h1>Function Declaration</h1>
  <center>Right click and press Inspect - Console (or) press F12</center>
  <script>
    greet();
  </script>
</body>
</html>
```

**Output:**
```
Function Declaration
Right click and press Inspect - Console (or) press F12
Hello, Students! from Function Declaration
```

### iii) Arrow Function
```html
<!DOCTYPE html>
<html>
<head>
  <title>Arrow Function</title>
  <script>
    const greet = () => {
      console.log("Hello students from Arrow function");
    };
  </script>
</head>
<body>
  <h1>Arrow Function</h1>
  pls right click and inspect (or) Press F12
  <script>
    greet();
  </script>
</body>
</html>
```

**Output:**
```
Arrow Function
pls right click and inspect (or) press F12
Hello students from Arrow function
```
