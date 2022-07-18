export class Booking{
    pnr!: number;
    flightNo!:number;
    email!: string;
    firstName!: string;
    lastName!: string;
    gender!: string;
    age!: number;
    totalSeat!: number;
    bookingStatus!: string;
    seatNo!: number;
    constructor(
        pnr:number,
        flightNo:number,
        email:string,
        firstName:string,
        lastName:string,
        gender:string,
        age:number,
        totalSeat:number,
        bookingStatus:string,
        seatNo:number
    ){}
}