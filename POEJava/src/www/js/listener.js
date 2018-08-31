$("#bookSearchBtn").on("click", function(){
    if(Number($("#booksearch").val())){
        ajaxFctn.searching("http://localhost:8080/Java/api/hello/bookprice/", $("#booksearch").val());
    }
    else{
        ajaxFctn.searching("http://localhost:8080/Java/api/hello/booktitle/", $("#booksearch").val());
    }
    return false;
})

$("#bookbtn").on("click", function(){
    ajaxFctn.id($("#bookid").val());
    return false;
})

$(document).on("click",'.prod', function(event){
    ajaxFctn.id(this.id);
    console.log($('#maindivid').find('input .inputclass').length)
})