var Book = {
    title : "",
    authorList : [],
    id : 0,
    price : 0,
    nbPage : 0
}

var clear = {
    doClear : function(endroit){
    $(endroit).html('');
    }
}

var tableau = {
    creer : function(endroit, id, titre, prix){
       $(endroit).append(
       "<table class='table'>"+
            "<tr>"+
                "<th>" + id +"</th>"+
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
    }
}

var ajaxFctn = {
    id : function(endroit){
    clear.doClear("#affichage")
    $.getJSON("http://localhost:8080/Java/api/hello/bookid/" + endroit, function(result){
        book = Object.create(Book)
        $.each(result, function(i, field){
            if(i == "id"){book.id = field;}
            if(i == "price"){book.price = field;}
            if(i == "title"){book.title = field;}
            });
            tableau.creer("#affichage", book.id, book.title, book.price);
        });
    },
    searching : function(uri, field){
        clear.doClear("#affichage")
        $.getJSON(uri + field, function(result){
            $.each(result, function(i, item){
                book = Object.create(Book)
                $.each(item, function(j, field){
                    if(j == "id"){book.id = field;}
                    if(j == "price"){book.price = field;}
                    if(j == "title"){book.title = field;}
                })
                tableau.creer("#affichage", book.id, book.title, book.price);
            })
        });
    }
}






