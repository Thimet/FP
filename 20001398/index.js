var express = require('express');
const app = express();
var path = require('path')
var multer  = require('multer');

const upload = multer({dest:'uploads/'});
const PORT = 8080;

app.get('/',function(req,res) {
    res.sendFile('index.html',{root:path.join(__dirname)});
});


app.post('/upload',upload.single('file'),(req, res)=>{
    res.send("completed")
});

app.listen(PORT,(err)=>{
    (err) ? console.log('Error in server') : console.log('server is running on',PORT);
});