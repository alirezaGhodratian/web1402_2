let fs = require ('fs');

let srcF = process.argv[2]
let disF=process.argv[3]

function callBack_func (err )
{
 if (err) {console.log('ERR : EROOR FOUND ' , err)}
else {console.log('FILE COPED')}
}


fs.copyFile ( srcF , disF , callBack_func)