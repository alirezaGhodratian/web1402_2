let fs = require ('fs');

let mes =process.argv[2]

let data = []
let j =0

for (let index = 3; process.argv.length; index++) 
{
 
    data[j]=process.argv[index]

    j++
    
}


function callBack_func (err)
{
 if (err) {console.log('ERR : EROOR FOUND')}
else {console.log('FILE SAVED')}
}


fs.writeFile (mes , data , callBack_func );
