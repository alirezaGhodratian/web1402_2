let fs = require ('fs');

let mes =process.argv[2]
let data = process.argv[3]

function callBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND')}
else {console.log('FILE SAVED')}
}


fs.appendFile (mes , data , callBack_func );