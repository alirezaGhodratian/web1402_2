let fs = require ('fs');

let shart = process.argv[2]

let mes =process.argv[3]
let data = process.argv[4]

let srcF = process.argv[3]
let disF=process.argv[4]


switch (shart)
{
    case 'create' : fs.writeFile (mes , data , createcallBack_func );

 break;

 case 'append' : fs.appendFile (mes , data , appendcallBack_func );

 break;

 case 'delete' : fs.unlink( mes , deletecallBack_func );

 break;

 case 'copy' : fs.copyFile ( srcF , disF , copycallBack_func);

 break;

 default : console.log('your request is wrong')

}

function createcallBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND')}
else {console.log('FILE SAVED')}
}

function appendcallBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND')}
else {console.log('FILE SAVED')}
}


function deletecallBack_func (err)
{
  if (err)
  {
    if (err.code === 'EPERM') 
  {fs.rmdir ( mes ,callBack_func)}
   else {console.log('ERR : EROOR FOUND' , err)}
   }  

    else { console.log ('FILE DELETED')}
}



function copycallBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND ' , err)}
else {console.log('FILE COPED')}
}










