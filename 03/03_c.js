let fs = require ('fs');

let mes = process.argv[2]
function callBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND')}
else {console.log('FILE DELETED')}
}


fs.unlink( mes ,callBack_func );