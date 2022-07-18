import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckFlightComponent } from './check-flight.component';

describe('CheckFlightComponent', () => {
  let component: CheckFlightComponent;
  let fixture: ComponentFixture<CheckFlightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CheckFlightComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
