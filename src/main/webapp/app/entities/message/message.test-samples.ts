import dayjs from 'dayjs/esm';

import { IMessage, NewMessage } from './message.model';

export const sampleWithRequiredData: IMessage = {
  id: 10168,
};

export const sampleWithPartialData: IMessage = {
  id: 8831,
  priority: 10924,
  data: 'icebreaker',
};

export const sampleWithFullData: IMessage = {
  id: 2775,
  priority: 27778,
  topic: 'midst comparison where',
  data: 'what',
  status: 'RECEIVED',
  receivedAt: dayjs('2025-03-29'),
};

export const sampleWithNewData: NewMessage = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
