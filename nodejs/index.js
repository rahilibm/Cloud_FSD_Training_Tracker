const os = require('os');
const fs = require('fs');
const http = require('http');
const express = require('express');
const app = express();

console.log(os.arch(),os.freemem(),os.homedir(),os.hostname(),os.uptime());

fs.readFile('names.txt',(err,data)=>{
    if(err){
        console.log(err);
    }else{
        console.log(data);
    }
})

fs.writeFile('names.txt','Hello world',(err)=>{
    if(err){
        console.log(err);
    }else{
        console.log('File updated!');
    }
})

fs.appendFile('names.txt','\nRahil',(err)=>{
    if(err){
        console.log(err);
    }else{
        console.log('File modified!');
    }
})

const myserver = http.createServer((req,res)=>{
    if(req.url==='/start'){
        res.end("Heyy User!")
    }
});

myserver.listen(8000,()=>console.log('Server started!'));

app.listen(7500,()=>console.log('Express server started!'));

app.get('/login', async (req, res) => {
    await res.send("Hello");
});

app.get('/home', (req, res) => {
    res.json({
        name: 'Aaryan',
        role: 'Trainer'
    });
});