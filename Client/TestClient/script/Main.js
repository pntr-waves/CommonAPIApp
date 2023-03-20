function Main () {
    window["getAPI"] = function (url, onDone, fail, message) {
        var request = new XMLHttpRequest();
        request.addEventListener("load", onDone);
        request.open("POST", url);
        request.send();
    }
}

Main();