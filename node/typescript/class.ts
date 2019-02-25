class Point {
    private _x : number;
    private _y : number;
    constructor(x:number,y:number){
        this._x = x;
        this._y = y;
    }
    public get X():number{
        return this._x;
    }
    public get Y():number{
        return this._y;
    }
}
let p1 = new Point(10,2);
console.log(p1.X);
console.log(p1.Y);