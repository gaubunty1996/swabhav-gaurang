var Point = /** @class */ (function () {
    function Point(x, y) {
        this._x = x;
        this._y = y;
    }
    Object.defineProperty(Point.prototype, "X", {
        get: function () {
            return this._x;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "Y", {
        get: function () {
            return this._y;
        },
        enumerable: true,
        configurable: true
    });
    return Point;
}());
var p1 = new Point(10, 2);
console.log(p1.X);
console.log(p1.Y);
