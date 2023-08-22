class Hero {
    constructor(image, top, left, size, speed) {
        this.image = image;
        this.top = top;
        this.left = left;
        this.size = size;
        this.speed = speed;
    }
    getHero(){
        return '<img width="'+ this.size + '"' +
            ' height="'+ this.size + '"' +
            ' src="' + this.image +'"' +
            ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
    }
    moveRight(){
        this.left += this.speed;
    }
    moveLeft(){
        this.left -= this.speed;
    }
    moveDown(){
        this.top += this.speed;
    }
    moveUp(){
        this.top -= this.speed;
    }
    start(){
        if(this.left < window.innerWidth - this.size){
            this.moveRight();
        }
        else{this.moveLeft()}
        if(this.top < window.innerHeight - this.size){
            this.moveDown();
        }
        else {
            this.moveUp()
        }
        document.getElementById('game').innerHTML = this.getHero();
    }
}
let hero =new Hero('meme.png', 20, 30, 200, 50);


setInterval(function () {
    hero.start()
}, 500)
