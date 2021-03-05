
window.onload=function() {
var images=document.querySelector("imgid");
var name=document.querySelector("#nameid");
var email=document.querySelector("#emailid");
var password=document.querySelector("#passid");
var del=document.querySelector("#delid");
var update=document.querySelector("#upid");
//searching the content of list
var search=document.getElementById("searchid");

    del.addEventListener('click', validdel);

    function validdel(e) {
        console.log("abcd");
        alert("Are you sure?");

    }

    search.addEventListener('keydown',filter);

    function filter(e) {

        var searchitem=e.target.value;
        console.log(searchitem);

        var headoflist=document.getElementById("head");
       var lists= headoflist.children;
       console.log("show below the list 0 item element")
       console.log(lists[0]);
        console.log("show below the list 1 item element")

        console.log(lists[1]);
        console.log("show below the list 2 item element")

        console.log(lists[2]);
        console.log("END")


        console.log("show below the list 0 item element text")

        console.log(lists[0].classList);


        Array.from(lists).forEach((item)=>{
           console.log("////////////////////////")
           console.log(item.textContent)
           if(item.textContent.toLowerCase().indexOf(searchitem)!=-1)
           {
               item.style.display='block';
           }
           else{
               item.style.display='none';
           }
       })


    }


}