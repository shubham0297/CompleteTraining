let project = {'code':'CUB', 'name':'e-passbook','manager':'vishnu'}
let manager = {"name":"Gokul"}

let clone = Object.assign(project,manager);                 // clone = project will work but not for multiple objects on right side
console.log(clone);


let{code,name} = project;
console.log(code);
console.log(name);

let{code:projCode , name: projName} = project;
console.log(projCode);
console.log(projName);


let employee ={"name":"SHubham" , "age":20};
let newEmp = {};
newEmp['name']=employee.name;
console.log(newEmp);

let newObj = {manager:{...employee}}
console.log(newObj);