var Book = {
    title : "",
    authorList : [],
    id : 0,
    price : 0,
    nbPage : 0,
    img : ''
}

var clear = {
    doClear : function(endroit){
    $(endroit).html('');
    }
}


var tableau = {
    creer : function(endroit, id, titre, prix){
       $(endroit).append(
       "<table>"+
            "<tr>"+
                "<th>" + id + "</th>"+
            "</tr>"+
            "<tr>"+
                "<td>" + titre +"</td>"+
            "</tr>"+
            "<tr>"+
                "<td>" + prix +"</td>"+
            "</tr>"+
            "<tr>"+
                "<td class='lien'><a id=" + id +" class='prod' href='#'>Consulter la fiche produit</td>" +
            "</tr>"+
       "</table>"
       )
    },
    creerSimple : function(endroit,id,titre, prix){
    $(endroit).append(
           "<table class='table'>"+
                "<tr>"+
                    "<th>" + id + "</th>"+
                "</tr>"+
                "<tr>"+
                    "<td>" + titre +"</td>"+
                "</tr>"+
                "<tr>"+
                    "<td>" + prix +"</td>"+
                "</tr>"+
           "</table>"
           )}
}

function hexToBase64(str) {
    return btoa(String.fromCharCode.apply(null, str.replace(/\r|\n/g, "").replace(/([\da-fA-F]{2}) ?/g, "0x$1 ").replace(/ +$/, "").split(" ")));
    }



var ajaxFctn = {
//Fonction ajax pour un simple objet JSON
    id : function(endroit){
    clear.doClear("#affichage")
    $.getJSON("http://localhost:8080/Java/api/hello/bookid/" + endroit, function(result){
        book = Object.create(Book)
        $.each(result, function(i, field){
            if(i == "id"){book.id = field;}
            if(i == "price"){book.price = field;}
            if(i == "title"){book.title = field;}
            if(i == "ImageColumn"){book.img = field;}
            });
            var img = new Image();
            img.src = "data:image/jpeg;base64,"+hexToBase64(book.img);
            tableau.creerSimple("#affichage", book.id, book.title, book.price);
        });
    },
//    Fonction pour liste d'objets JSON
    searching : function(uri, field){
        clear.doClear("#affichage")
        $.getJSON(uri + field, function(result){
            $.each(result, function(i, item){
                book = Object.create(Book)
                $.each(item, function(j, field){
                    if(j == "id"){book.id = field;}
                    if(j == "price"){book.price = field;}
                    if(j == "title"){book.title = field;}
                    if(i == "ImageColumn"){book.img = field;}
                })

                tableau.creer("#affichage", book.id, book.title, book.price);
            })
        });
    }
}






