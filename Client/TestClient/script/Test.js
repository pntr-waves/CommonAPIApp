function Test () {
    getAPI("http://localhost:8080/Test", function (e) {
        console.log(e);
    });
}


Test();
