var addRow = document.getElementById('addRow');            //var is variant         // will show error...as button is not rendered yet // so add script before closing body tag 
        
        addRow.addEventListener("click",function(){     // Callback funtion - Whenever a function takes another function as input. Not immediately called, when user performs action
            console.log("Click event fired");
        });