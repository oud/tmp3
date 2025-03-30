import dayjs from 'dayjs/esm';
import { Status } from 'app/entities/enumerations/status.model';

export interface IMessage {
  id: number;
  priority?: number | null;
  topic?: string | null;
  data?: string | null;
  status?: keyof typeof Status | null;
  receivedAt?: dayjs.Dayjs | null;
}

export type NewMessage = Omit<IMessage, 'id'> & { id: null };
