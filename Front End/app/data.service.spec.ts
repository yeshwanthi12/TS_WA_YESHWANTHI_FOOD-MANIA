import { TestBed } from '@angular/core/testing';

import { DataService } from './data-service.service';

describe('DataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DataService = TestBed.get(DataServiceService);
    expect(service).toBeTruthy();
  });
});
