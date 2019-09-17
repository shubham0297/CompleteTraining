import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchOperatorComponent } from './fetch-operator.component';

describe('FetchOperatorComponent', () => {
  let component: FetchOperatorComponent;
  let fixture: ComponentFixture<FetchOperatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FetchOperatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FetchOperatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
