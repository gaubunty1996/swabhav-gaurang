const userNames : String = "gaurang"
const companys : String = "aurio-pro"
const ages : number = 21
const isMales : boolean = true
const userLocations = 'mumbai'

const detail = `employee name is ${userNames}
working at ${companys}
ages is ${ages}
and is gender male ${isMales}
residnt in ${userLocations}`
function displays (data : String) {
    console.log(data);
}
displays(detail);