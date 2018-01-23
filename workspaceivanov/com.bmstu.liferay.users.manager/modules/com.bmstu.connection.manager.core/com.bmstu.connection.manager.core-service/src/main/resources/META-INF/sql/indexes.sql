create index IX_293EBD86 on CM_Connection (connectionId);
create index IX_216C0AAD on CM_Connection (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4DE1586F on CM_Connection (uuid_[$COLUMN_LENGTH:75$], groupId);