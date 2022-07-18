export class addFlight{
        flightNo!: number;
        airline!: string;
        start!: string;
        end!: string;
        startDate!: Date;
        startTime!: string;
        endDate!: Date;
        endtTime!: string;
        sheduleDay!: string;
        bussinessSeat!: number;
        nonBussinessSeat!: number;
        price!: number;
        flightStatus!: string;
    constructor( 
        flightNo:number,
        airline:string,
        start:string,
        end:string,
        startDate:Date,
        startTime:string,
        endDate:Date,
        endtTime:string,
        sheduleDay:string,
        bussinessSeat:number,
        nonBussinessSeat:number,
        price:number,
        flightStatus:string,
        ){}
}