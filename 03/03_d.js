let fs = require ('fs');

let mes = process.argv[2]

function callBack_func (err)
{
  if (err)
  {
    if (err.code === 'EPERM') 
  {fs.rmdir ( mes ,callBack_func)}
   else {console.log('ERR : EROOR FOUND' , err)}
   }  

    else { console.log ('FILE DELETED')}
}


fs.unlink( mes , callBack_func );