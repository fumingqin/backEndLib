-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司', '3', '1', 'company', 'company/company/index', 1, 'C', '0', '0', 'company:company:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '公司菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'company:company:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'company:company:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'company:company:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'company:company:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu  (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公司导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'company:company:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');
