//node .\03-f.js create x.txt salamSALAMsalam
//node .\03-f.js append x.txt salamSALAMsalam
//node .\03-f.js delete x.txt
//node .\03-f.js delete myDirName
//node .\03-f.js copy x.txt y.txt  


let fs = require('fs');
const { argv } = require('process');
let command = process.argv[2];
let name = process.argv[3];
let arg4 = process.argv[4];

function writeFileCallback(err) {
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log('writeFile  successfull.');
    }
}

function appendFileCallback(err) {
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log('append  successfull.');
    }
}

function unlinkCallback(err) {
    if(err){
        if(err.code === 'EPERM'){
            fs.rmdir(name, rmdirCallback); 
        }
        else{
            console.log('ERR: ', err)
        }
    }
    else{
        console.log("unlink  successfull.")
    }
}

function rmdirCallback(err){
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log('rmdir successfull')
    }
}

function copyFileCallback(err){
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log('copyFile successfill')
    }
}

let messages ={
    copy: 'copyFile successfull',
    append: 'append  successfull.',
    create: 'writeFile  successfull.',
    createRecord :'add data on databace was successfull ',
    readRecord : 'all info read successfull'


}

function fsCallback(err){
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log(messages[command])
    }
}



function fsREADCallback(err , data){
    if(err){
        console.log('ERR: ', err);
    }
    else{
        console.log(data)
        }}

    
        
let commands = {
    create: function(){
        fs.writeFile(name, arg4, fsCallback);
    },
    append: function(){
        fs.appendFile(name, arg4, fsCallback); 
    },
    delete: function(){
        fs.unlink(name, unlinkCallback);
    },
    copy: function(){
        fs.copyFile(name, arg4, fsCallback);
    } ,
    read: function(){
        fs.readFile(  name , '', fsREADCallback );
    },

    createRecord :function()
    {
        let DATA = {
            Name : process.argv[3],
            family : process.argv[4],
            email : process.argv[5]
        }

        fs.readFile('databace.json' ,'UTF8' , function(err , newinfo) {

            if (err) { console.log ('ERR' , err)}

            else 
            {
                newinfo=JSON.parse(newinfo)
                newinfo.records.push (DATA)
                newinfo=JSON.stringify(newinfo)

                fs.writeFile('databace.json',newinfo,fsCallback)
            }
        })

    },

    readRecord : function()
    {

        let index = process.argv[3]

        fs.readFile('databace.json' ,'UTF8' , function(err , newinfo2) {

            if (err) { console.log ('ERR' , err)}

            else 
            {
                newinfo2=JSON.parse(newinfo2)
                console.log('all databace info is :', newinfo2.records[index])
                
            }
        })



    },

    // updateRecord :function()
    // {
    //     let DATA = {
    //         Name : process.argv[3],
    //         family : process.argv[4],
    //         email : process.argv[5]
    //     }

    //     let index = process.argv[6];

    //     fs.readFile('databace.json' ,'UTF8' , function(err , newinfo) {

    //         if (err) { console.log ('ERR' , err)}

    //         else 
    //         {
    //             newinfo=JSON.parse(newinfo)
    //             newinfo.records.push
    //             newinfo=JSON.stringify(newinfo)

    //             fs.writeFile('databace.json',newinfo,fsCallback)
    //         }
    //     })

        

    }

  
    


commands[command]();

