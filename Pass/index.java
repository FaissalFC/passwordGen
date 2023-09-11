const characters =["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9","~","`","!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","[","}","]",",","|",":",";","<",">",".","?",
"/"];

let password1 = document.getElementById("btn")
let password2 = document.getElementById("btn1")

function gen() {
    x = Math.floor(Math.random()*characters.length)
    x = characters[x]
}

function generete() {
    let ab = []
    let bc = []
    for (i = 0; i < 15; i++)
    gen(), ab.push(x)
    ab = ab.join('')
    password1.textContent = ab
    ab = []
    for (i = 0; i < 15; i++)
    gen(), bc.push(x)
    bc = bc.join('')
    password2.textContent = bc
    bc = []
}

function copyStringToClipboard1 () {
       var str = document.getElementById("btn").innerText;
       // Create new element
       var el = document.createElement('textarea');
       // Set value (string to be copied)
       el.value = str;
       // Set non-editable to avoid focus and move outside of view
       el.setAttribute('readonly', '');
       el.style = {position: 'absolute', left: '-9999px'};
       document.body.appendChild(el);
       // Select text inside element
       el.select();
       // Copy text to clipboard
       document.execCommand('copy');
       // alert 
       alert("Password 1 copied")
       // Remove temporary element
       document.body.removeChild(el);
    }
    
    function copyStringToClipboard2 () {
       var str = document.getElementById("btn1").innerText;
       // Create new element
       var el = document.createElement('textarea');
       // Set value (string to be copied)
       el.value = str;
       // Set non-editable to avoid focus and move outside of view
       el.setAttribute('readonly', '');
       el.style = {position: 'absolute', left: '-9999px'};
       document.body.appendChild(el);
       // Select text inside element
       el.select();
       // Copy text to clipboard
       document.execCommand('copy');
       alert("Password 2 copied")
       // Remove temporary element
       document.body.removeChild(el);
    }
    